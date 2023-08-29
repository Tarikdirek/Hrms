package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.EmployerService;
import project.hmrs.business.services.validations.emailVerifications.EmailVerificationService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.ErrorResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.EmployerDao;
import project.hmrs.entities.concretes.users.Employer;
import project.hmrs.entities.concretes.verifications.EmployerEmailVerification;

@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;
	EmailVerificationService emailVerificationService;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,EmailVerificationService emailVerificationService) {
		this.employerDao = employerDao;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public Result add(Employer employer) {
		
		if (!(emailVerificationService.createEmployerEmailVerificationCode(employer))) {
			return new ErrorResult("Email doğrulaması başarısız");
		}
		
		if (!(checkIfEmailExist(employer).isSuccess())) {
			return new ErrorResult("Girdiğiniz email kullanımda");
		}
		
		employerDao.save(employer);
		
		return new SuccessResult("İş veren kaydı başarılı bir şekilde gerçekleşti ");
	}

	@Override
	public Result delete(Employer employer) {
		employerDao.deleteById(employer.getId());
		return new SuccessResult("İş veren veritabanından silindi");
	}

	@Override
	public Result update(Employer employer) {
		employerDao.saveAndFlush(employer);
		return new SuccessResult("İş veren başarılı bir şekilde güncellendi");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
	    var result=	employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result,"İş verenler başarılı bir şekilde listelendi");
	}
	
	private Result checkIfEmailExist(Employer employer) {
		var result = employerDao.findAll();
		
		for (Employer item : result) {
			if (item.getEmail().matches(employer.getEmail())) {
				return new ErrorResult();
			}
		}
		return new SuccessResult();
	}

}
