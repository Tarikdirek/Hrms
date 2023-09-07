package project.hmrs.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerLanguageInfoService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerLanguageInfo;

@RestController
@RequestMapping("api/jobSeekerLanguageInfos")
@CrossOrigin
public class JobSeekerLanguageInfoController {
	
	private JobSeekerLanguageInfoService jobSeekerLanguageInfoService;
	
	@Autowired
	public JobSeekerLanguageInfoController(JobSeekerLanguageInfoService jobSeekerLanguageInfoService) {
		this.jobSeekerLanguageInfoService = jobSeekerLanguageInfoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerLanguageInfo jobSeekerLanguageInfo) {
		
		return 	jobSeekerLanguageInfoService.add(jobSeekerLanguageInfo);
	}
}
