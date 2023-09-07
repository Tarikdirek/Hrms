package project.hmrs.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerCoverLetterService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerCoverLetter;

@RestController
@RequestMapping("api/jobSeekerCoverLetter")
@CrossOrigin
public class JobSeekerCoverLetterController {
	
	private JobSeekerCoverLetterService jobSeekerCoverLetterService;
	
	@Autowired
	public JobSeekerCoverLetterController(JobSeekerCoverLetterService jobSeekerCoverLetterService) {
		this.jobSeekerCoverLetterService = jobSeekerCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerCoverLetter jobSeekerCoverLetter) {
		
		return 	jobSeekerCoverLetterService.add(jobSeekerCoverLetter);
	}
}
