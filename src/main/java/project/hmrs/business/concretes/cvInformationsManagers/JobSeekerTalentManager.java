package project.hmrs.business.concretes.cvInformationsManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerTalentService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerTalentDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerTalent;

@Service
public class JobSeekerTalentManager implements JobSeekerTalentService {

	private JobSeekerTalentDao jobSeekerTalentDao;
	
	@Autowired
	public JobSeekerTalentManager(JobSeekerTalentDao jobSeekerTalentDao) {
		this.jobSeekerTalentDao = jobSeekerTalentDao;
	}


	@Override
	public Result add(JobSeekerTalent jobSeekerTalent) {
		jobSeekerTalentDao.save(jobSeekerTalent);
		return new SuccessResult("İş arayan yeteneği başarılı bir şekilde kaydedildi");
	}

}
