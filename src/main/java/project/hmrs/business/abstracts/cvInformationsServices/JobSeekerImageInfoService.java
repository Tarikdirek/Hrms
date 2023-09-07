package project.hmrs.business.abstracts.cvInformationsServices;



import org.springframework.web.multipart.MultipartFile;


import project.hmrs.core.utilities.results.Result;



public interface JobSeekerImageInfoService {
	Result add(MultipartFile file, int jobSeekerId);
	
}
