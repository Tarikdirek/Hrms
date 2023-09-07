package project.hmrs.business.concretes.cvInformationsManagers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerEducationInfoService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerEducationInfoDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerEducationInfo;

@Service
public class JobSeekerEducationInfoManager implements JobSeekerEducationInfoService {

	private JobSeekerEducationInfoDao jobSeekerEducationInfoDao;
	
	@Autowired
	public JobSeekerEducationInfoManager(JobSeekerEducationInfoDao jobSeekerEducationInfoDao) {
		this.jobSeekerEducationInfoDao = jobSeekerEducationInfoDao;
	}

	@Override
	public Result add(JobSeekerEducationInfo jobSeekerEducationInfo) {
		
		jobSeekerEducationInfoDao.save(jobSeekerEducationInfo);
		
		return new SuccessResult("İş arayan öğrenim bilgileri başarılı bir şekilde kaydedildi");
	}

	@Override
	public DataResult<List<JobSeekerEducationInfo>> getAll() {
		var result = jobSeekerEducationInfoDao.findAll();
		
		return new SuccessDataResult<List<JobSeekerEducationInfo>>(result,"Başarılı");
	}

	@Override
	public DataResult<List<JobSeekerEducationInfo>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"endDate");
		var result = jobSeekerEducationInfoDao.findAll(sort);
		return new SuccessDataResult<List<JobSeekerEducationInfo>>(result, "İş arayan öğrenim bilgileri başarılı bir şekilde"
				+ " listelendi");
	}

}
