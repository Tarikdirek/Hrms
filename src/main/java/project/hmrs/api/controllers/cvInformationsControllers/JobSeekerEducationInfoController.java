package project.hmrs.api.controllers.cvInformationsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerEducationInfoService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerEducationInfo;

@RestController
@RequestMapping("api/jobSeekerEducationInfos")
@CrossOrigin
public class JobSeekerEducationInfoController {
	
	private JobSeekerEducationInfoService jobSeekerEducationInfoService;
	
	@Autowired
	public JobSeekerEducationInfoController(JobSeekerEducationInfoService jobSeekerEducationInfoService) {
		this.jobSeekerEducationInfoService = jobSeekerEducationInfoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerEducationInfo jobSeekerEducationInfo) {
		
		return 	jobSeekerEducationInfoService.add(jobSeekerEducationInfo);
	}
	
	@GetMapping("/getall")
	public Result getAll() {
		return jobSeekerEducationInfoService.getAll();
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<JobSeekerEducationInfo>> getAllSorted(){
		return jobSeekerEducationInfoService.getAllSorted();
	}
}
