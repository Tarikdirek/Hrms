package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.JobTitleService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.JobTitleDao;
import project.hmrs.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {

		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public DataResult<List<JobTitle>>  getAll() {
		
		var result = jobTitleDao.findAll();
		
		return new SuccessDataResult<List<JobTitle>>(result,"Meslekler listelendi"); 
	}


	@Override
	public Result add(JobTitle jobTitle) {
	 jobTitleDao.save(jobTitle);
	 return new SuccessResult(jobTitle.getTitle()+ " veritabanına eklendi");
		
	}


	@Override
	public Result delete(JobTitle jobTitle) {
		jobTitleDao.deleteById(jobTitle.getId());
		return new SuccessResult(jobTitle.getTitle()+ " veritabanındab silindi");
	}


	@Override
	public Result update(JobTitle jobTitle) {
		
		jobTitleDao.saveAndFlush(jobTitle);
		return new SuccessResult("Meslek " +jobTitle.getTitle()+" olarak güncellendi");
	}

}
