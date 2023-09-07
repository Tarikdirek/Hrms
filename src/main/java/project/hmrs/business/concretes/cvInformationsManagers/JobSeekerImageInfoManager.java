package project.hmrs.business.concretes.cvInformationsManagers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.hmrs.business.abstracts.cvInformationsServices.JobSeekerImageInfoService;
import project.hmrs.business.services.storage.FileOperations;
import project.hmrs.business.services.storage.FileService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.JobSeekerDao;
import project.hmrs.dataAccess.abstracts.cvInformationsDaos.JobSeekerImageInfoDao;
import project.hmrs.entities.concretes.cvInformations.JobSeekerImageInfo;

@Service
public class JobSeekerImageInfoManager implements JobSeekerImageInfoService {

	private JobSeekerImageInfoDao jobSeekerImageInfoDao;
	private FileService fileService;
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerImageInfoManager(JobSeekerImageInfoDao jobSeekerImageInfoDao,FileService fileService
			,JobSeekerDao jobSeekerDao) {
		this.jobSeekerImageInfoDao = jobSeekerImageInfoDao;
		this.fileService=fileService;
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(MultipartFile file, int jobSeekerId) {
		
		JobSeekerImageInfo jobSeekerImageInfo = new JobSeekerImageInfo();
		
		try {
			String filePath= fileService.uploadFile(file);
			jobSeekerImageInfo.setJobSeeker(jobSeekerDao.findById(jobSeekerId).orElseThrow());
			jobSeekerImageInfo.setImageName(FileOperations.getFileName(file));
			jobSeekerImageInfo.setStorageName(fileService.getFileStorageName());
			jobSeekerImageInfo.setImagePath(filePath);
			
			
		} catch (IOException e) {
			throw new RuntimeException();
		}
		
		jobSeekerImageInfoDao.save(jobSeekerImageInfo);
		
		return new SuccessResult("Profil resminiz başarılı bir şekilde kaydedildi");
	}

	
}
