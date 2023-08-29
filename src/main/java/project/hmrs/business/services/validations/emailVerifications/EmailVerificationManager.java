package project.hmrs.business.services.validations.emailVerifications;

import org.springframework.stereotype.Service;

import project.hmrs.entities.concretes.users.Employer;
import project.hmrs.entities.concretes.users.JobSeeker;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public boolean createEmployerEmailVerificationCode(Employer employer) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean createJobSeekerEmailVerificationCode(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return true;
	}

}
