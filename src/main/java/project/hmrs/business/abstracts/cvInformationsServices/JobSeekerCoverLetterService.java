package project.hmrs.business.abstracts.cvInformationsServices;

import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerCoverLetter;

public interface JobSeekerCoverLetterService {
	
	Result add(JobSeekerCoverLetter jobSeekerCoverLetter);
	
}
