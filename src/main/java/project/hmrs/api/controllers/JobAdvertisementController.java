package project.hmrs.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.JobAdvertisementService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementController {

	JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return  jobAdvertisementService.add(jobAdvertisement);
	}
	
	
	@GetMapping("/getall")
	public Result getAll() {
		return jobAdvertisementService.getAll();
	}
	
	@GetMapping("/findByStatusTrue")
	public Result findByStatusTrue() {
		return jobAdvertisementService.findByStatusTrue();
	}
	
	@GetMapping("/findByCompanyNameIsAndStatusTrue")
	public Result findByCompanyNameIsAndStatusTrue(@RequestParam String employer) {
		return jobAdvertisementService.findByEmployerCompanyNameIsAndStatusTrue(employer);
	}
	
	@GetMapping("/findByStatusTrueOrderByApplicationStart")
	public Result findByStatusTrueOrderByApplicationStart() {
		return jobAdvertisementService.findByStatusTrueOrderByApplicationStart();
	}
	
	@PutMapping("/setJobAdvertisementStatusFalse/{jobAdvertisementId}")
	public Result setJobAdvertisementStatusFalse(@PathVariable int jobAdvertisementId) {
		return jobAdvertisementService.setJobAdvertisementStatusFalse(jobAdvertisementId);
	}
	
}
