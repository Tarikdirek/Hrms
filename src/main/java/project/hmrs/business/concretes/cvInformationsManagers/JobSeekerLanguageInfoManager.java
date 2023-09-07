package project.hmrs.business.concretes.cvInformationsManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerLanguageInfoService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerLanguageInfoDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerLanguageInfo;


@Service
public class JobSeekerLanguageInfoManager implements JobSeekerLanguageInfoService {

	private JobSeekerLanguageInfoDao jobSeekerLanguageInfoDao;
	
	@Autowired
	public JobSeekerLanguageInfoManager(JobSeekerLanguageInfoDao jobSeekerLanguageInfoDao) {

		this.jobSeekerLanguageInfoDao = jobSeekerLanguageInfoDao;
	}

	
	

	@Override
	public Result add(JobSeekerLanguageInfo jobSeekerLanguageInfo) {
		jobSeekerLanguageInfoDao.save(jobSeekerLanguageInfo);
		return new SuccessResult("İş arayan dil bilgileri başarılı bir şekilde kaydedildi");
	}

}
