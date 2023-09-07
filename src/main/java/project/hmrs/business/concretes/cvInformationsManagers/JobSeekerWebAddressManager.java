package project.hmrs.business.concretes.cvInformationsManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerWebAddressService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerWebAddressDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerWebAddress;

@Service
public class JobSeekerWebAddressManager implements JobSeekerWebAddressService {

	private JobSeekerWebAddressDao jobSeekerWebAddressDao;
	
	@Autowired
	public JobSeekerWebAddressManager(JobSeekerWebAddressDao jobSeekerWebAddressDao) {
		this.jobSeekerWebAddressDao = jobSeekerWebAddressDao;
	}


	@Override
	public Result add(JobSeekerWebAddress jobSeekerWebAddress) {
		jobSeekerWebAddressDao.save(jobSeekerWebAddress);
		return new SuccessResult("İş arayan web adresi başarılı bir şekilde kaydedildi");
	}

}
