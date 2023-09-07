package project.hmrs.api.controllers.cvInformationsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerImageInfoService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerImageInfo;

@RestController
@RequestMapping(value = "api/jobSeekerImageInfo", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE	})
@CrossOrigin
public class JobSeekerImageInfoController {
	
	private JobSeekerImageInfoService jobSeekerImageInfoService;

	@Autowired
	public JobSeekerImageInfoController(JobSeekerImageInfoService jobSeekerImageInfoService) {
		this.jobSeekerImageInfoService = jobSeekerImageInfoService;
	}
	
	@PostMapping("/uploadFile")
	public Result uploadFile(@RequestParam("file") MultipartFile file, @RequestParam int jobSeekerId) {
		
		
		return 	jobSeekerImageInfoService.add(file, jobSeekerId) ;
	}
	
	
}
