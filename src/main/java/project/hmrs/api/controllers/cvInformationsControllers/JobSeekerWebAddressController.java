package project.hmrs.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerWebAddressService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerWebAddress;

@RestController
@RequestMapping("api/jobSeekerWebAddresses")
@CrossOrigin
public class JobSeekerWebAddressController {
	
	private JobSeekerWebAddressService jobSeekerWebAddressService;
	
	@Autowired
	public JobSeekerWebAddressController(JobSeekerWebAddressService jobSeekerWebAddressService) {
		this.jobSeekerWebAddressService = jobSeekerWebAddressService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerWebAddress jobSeekerWebAddress) {
		
		return 	jobSeekerWebAddressService.add(jobSeekerWebAddress);
	}
}
