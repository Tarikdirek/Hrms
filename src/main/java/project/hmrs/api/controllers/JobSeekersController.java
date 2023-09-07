package project.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.JobSeekerService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.users.JobSeeker;
import project.hmrs.entities.dtos.JobSeekerMiniCvDto;

@RestController
@RequestMapping("api/jobseekers")
@CrossOrigin
public class JobSeekersController {
	
	JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>>  getAll(){
		return jobSeekerService.getAll();
	}
	
	@GetMapping("/getcvinfo")
	public DataResult<List<JobSeekerMiniCvDto>> getJobSeekerWithFullCv(){
		return jobSeekerService.getJobSeekerWithFullCv();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		
		return 	jobSeekerService.add(jobSeeker);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobSeeker jobSeeker) {
		
		return jobSeekerService.delete(jobSeeker);
		
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobSeeker jobSeeker) {
		
		return jobSeekerService.update(jobSeeker);
		
	}
	
}
