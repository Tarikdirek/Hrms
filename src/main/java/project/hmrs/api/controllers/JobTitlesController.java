package project.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.JobTitleService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitles")
public class JobTitlesController {

	JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>>  getAll(){
		return jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		
		return jobTitleService.add(jobTitle);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobTitle jobTitle) {
		
		return jobTitleService.delete(jobTitle);
		
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobTitle jobTitle) {
		
		return jobTitleService.update(jobTitle);
		
	}
	
}
