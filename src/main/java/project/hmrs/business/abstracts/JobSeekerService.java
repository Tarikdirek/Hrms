package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.users.JobSeeker;

public interface JobSeekerService {
	
	Result add(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
}
