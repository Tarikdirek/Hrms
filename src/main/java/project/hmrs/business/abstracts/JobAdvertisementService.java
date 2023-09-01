package project.hmrs.business.abstracts;

import java.util.List;



import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	Result setJobAdvertisementStatusFalse(int jobAdvertisementId);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> findByStatusTrue();
	DataResult<List<JobAdvertisement>> findByEmployerCompanyNameIsAndStatusTrue(String companyName);
	DataResult<List<JobAdvertisement>> findByStatusTrueOrderByApplicationStart();
}
