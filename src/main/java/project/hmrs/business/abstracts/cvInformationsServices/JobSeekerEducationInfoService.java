package project.hmrs.business.abstracts.cvInformationsServices;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerEducationInfo;

public interface JobSeekerEducationInfoService {
	
	Result add(JobSeekerEducationInfo jobSeekerEducationInfo);
	DataResult<List<JobSeekerEducationInfo>> getAll();
	DataResult<List<JobSeekerEducationInfo>> getAllSorted();
}
