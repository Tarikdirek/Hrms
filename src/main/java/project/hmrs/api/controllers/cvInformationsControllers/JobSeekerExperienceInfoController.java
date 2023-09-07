package project.hmrs.api.controllers.cvInformationsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerExperienceInfoService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerExperienceInfo;

@RestController
@RequestMapping("api/jobSeekerExperienceInfos")
@CrossOrigin
public class JobSeekerExperienceInfoController {
	
	private JobSeekerExperienceInfoService jobSeekerExperienceInfoService;
	
	@Autowired
	public JobSeekerExperienceInfoController
	(JobSeekerExperienceInfoService jobSeekerExperienceInfoService) {
		this.jobSeekerExperienceInfoService = jobSeekerExperienceInfoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerExperienceInfo jobSeekerExperienceInfo) {
		
		return jobSeekerExperienceInfoService.add(jobSeekerExperienceInfo);
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<JobSeekerExperienceInfo>> getAllSorted(){
		return jobSeekerExperienceInfoService.getAllSorted();
	}
}
