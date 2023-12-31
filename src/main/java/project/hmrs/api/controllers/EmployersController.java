package project.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.EmployerService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.users.Employer;

@RestController
@RequestMapping("api/employers")
@CrossOrigin
public class EmployersController {
	
	EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>>  getAll(){
		return employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		
		return 	employerService.add(employer);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer) {
		
		return employerService.delete(employer);
		
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Employer employer) {
		
		return employerService.update(employer);
		
	}
}
