package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.users.JobSeeker;
import project.hmrs.entities.dtos.JobSeekerMiniCvDto;

public interface JobSeekerService {
	
	Result add(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
	DataResult<List<JobSeekerMiniCvDto>> getJobSeekerWithFullCv();
}
