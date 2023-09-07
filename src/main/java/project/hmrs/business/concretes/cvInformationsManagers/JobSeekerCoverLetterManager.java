package project.hmrs.business.concretes.cvInformationsManagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerCoverLetterService;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerCoverLetterDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerCoverLetter;

@Service
public class JobSeekerCoverLetterManager implements JobSeekerCoverLetterService {

	private JobSeekerCoverLetterDao jobSeekerCoverLetterDao;
	
	@Autowired
	public JobSeekerCoverLetterManager(JobSeekerCoverLetterDao jobSeekerCoverLetterDao) {
		this.jobSeekerCoverLetterDao = jobSeekerCoverLetterDao;
	}

	@Override
	public Result add(JobSeekerCoverLetter jobSeekerCoverLetter) {
		jobSeekerCoverLetterDao.save(jobSeekerCoverLetter);
		return new SuccessResult("Ön yazı başarılı bir şekilde eklendi");
	}

}
