package project.hmrs.business.services.validations.emailVerifications;

import project.hmrs.entities.concretes.users.Employer;
import project.hmrs.entities.concretes.users.JobSeeker;

public interface EmailVerificationService {
	
	boolean createEmployerEmailVerificationCode(Employer employer);
	boolean createJobSeekerEmailVerificationCode(JobSeeker jobSeeker);
}
