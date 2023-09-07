package project.hmrs.business.concretes.cvInformationsManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerExperienceInfoService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerExperienceInfoDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerExperienceInfo;

@Service
public class JobSeekerExperienceInfoManager implements JobSeekerExperienceInfoService {

	private JobSeekerExperienceInfoDao jobSeekerExperienceInfoDao;
	
	@Autowired
	public JobSeekerExperienceInfoManager(JobSeekerExperienceInfoDao jobSeekerExperienceInfoDao) {
		this.jobSeekerExperienceInfoDao = jobSeekerExperienceInfoDao;
	}

	@Override
	public Result add(JobSeekerExperienceInfo jobSeekerExperienceInfo) {
		jobSeekerExperienceInfoDao.save(jobSeekerExperienceInfo);
		return new SuccessResult("İş arayan deneyimi başarılı bir şekilde kaydedildi");
	}

	@Override
	public DataResult<List<JobSeekerExperienceInfo>> getAllSorted() {
		Sort sort= Sort.by(Sort.Direction.DESC,"endDate");
		var result= jobSeekerExperienceInfoDao.findAll(sort);
		return new SuccessDataResult<List<JobSeekerExperienceInfo>>(result, "İş arayan deneyimi başarılı bir şekilde"
				+ " listelendi");
	}

	
}
