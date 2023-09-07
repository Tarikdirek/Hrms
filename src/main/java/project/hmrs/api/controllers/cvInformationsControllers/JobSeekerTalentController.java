package project.hmrs.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerTalentService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerTalent;

@RestController
@RequestMapping("api/jobSeekerTalents")
@CrossOrigin
public class JobSeekerTalentController {
	
	private JobSeekerTalentService jobSeekerTalentService;
	
	@Autowired
	public JobSeekerTalentController(JobSeekerTalentService jobSeekerTalentService) {
		this.jobSeekerTalentService = jobSeekerTalentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerTalent jobSeekerTalent) {
		
		return 	jobSeekerTalentService.add(jobSeekerTalent);
	}
}
