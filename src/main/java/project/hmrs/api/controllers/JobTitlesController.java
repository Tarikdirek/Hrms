package project.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.JobTitleService;
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
	public List<JobTitle> getAll(){
		return jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public void add(JobTitle jobTitle) {
		jobTitleService.add(jobTitle);
	}
	
	@PostMapping("/delete")
	public void delete(JobTitle jobTitle) {
		jobTitleService.delete(jobTitle);
	}
	
}
