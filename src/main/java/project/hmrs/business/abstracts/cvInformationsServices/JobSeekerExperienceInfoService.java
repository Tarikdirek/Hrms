package project.hmrs.business.abstracts.cvInformationsServices;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.cvInformations.JobSeekerExperienceInfo;

public interface JobSeekerExperienceInfoService {
	
	Result add(JobSeekerExperienceInfo jobSeekerExperienceInfo);
	DataResult<List<JobSeekerExperienceInfo>> getAllSorted();
}
