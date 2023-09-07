package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import project.hmrs.business.abstracts.JobSeekerService;
import project.hmrs.business.services.validations.emailVerifications.EmailVerificationService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.ErrorResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.JobSeekerDao;
import project.hmrs.entities.concretes.users.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	JobSeekerDao jobSeekerDao;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,EmailVerificationService emailVerificationService) {
		this.jobSeekerDao = jobSeekerDao;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if (jobSeekerDao.findByNationalId(jobSeeker.getNationalId()) != null) {
			return new ErrorResult("Girdiğiniz TC Kimlik No kullanımda");
		}
		
		if(jobSeekerDao.findByEmail(jobSeeker.getEmail()) != null) {
			return new ErrorResult("Girdiğiniz email kullanımda");
		}
		
		if (!(checkIfEmailVerified(jobSeeker).isSuccess())) {
			return new ErrorResult("Email adresiniz doğrulanmadı");
		}
		
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult(jobSeeker.getFirstName() + " kaydınız başarılı bir şekilde tamamlanmıştır");
		
		
		
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		jobSeekerDao.deleteById(jobSeeker.getId());
		
		return new SuccessResult("İş arayan veritabanından silindi");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		jobSeekerDao.saveAndFlush(jobSeeker);
		
		return new SuccessResult("İş arayan başarılı bir şekilde güncellendi");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		var result = jobSeekerDao.findAll();
		
		
		return new SuccessDataResult<List<JobSeeker>>(result, "İş arayanlar başarılı bir şekilde listelendi");
	}
	
	
	private Result checkIfEmailVerified(JobSeeker jobSeeker) {
		
		if (emailVerificationService.createJobSeekerEmailVerificationCode(jobSeeker)) {
			return new SuccessResult();
		}return new ErrorResult();
	
	}
	

}
