package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.JobTitleService;
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
	public List<JobTitle> getAll() {
		
		var result = jobTitleDao.findAll();
		
		return result;
	}


	@Override
	public void add(JobTitle jobTitle) {
	 
		jobTitleDao.save(jobTitle);
		
	}


	@Override
	public void delete(JobTitle jobTitle) {
		jobTitleDao.deleteById(jobTitle.getId());
		
	}


	@Override
	public void update(JobTitle jobTitle) {
		
		jobTitleDao.saveAndFlush(jobTitle);
		
	}

}
