package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.JobAdvertisementService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.JobAdvertisementDao;
import project.hmrs.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
	  jobAdvertisementDao.save(jobAdvertisement);
		
	  return new SuccessResult("İş ilanı başarılı bir şekilde eklendi");	
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		var result = jobAdvertisementDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>(result, "İş ilanları başarılı bir şekilde listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByStatusTrue() {
		var result = jobAdvertisementDao.findByStatusTrue();
		return new SuccessDataResult<List<JobAdvertisement>>(result, " Aktif iş ilanları başarılı bir şekilde listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByEmployerCompanyNameIsAndStatusTrue(String companyName) {
		var result = jobAdvertisementDao.findByEmployerCompanyNameIsAndStatusTrue(companyName);
		return new SuccessDataResult<List<JobAdvertisement>>(result,  "Firmaya ait aktif iş ilanları başarılı bir "
				+ "şekilde listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByStatusTrueOrderByApplicationStart() {
		
		
		var result = jobAdvertisementDao.findByStatusTrueOrderByApplicationStart();
		return new SuccessDataResult<List<JobAdvertisement>>(result, "İş ilan başarılı bir şekilde listelendi");
	}

	@Override
	public Result setJobAdvertisementStatusFalse(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement = jobAdvertisementDao.findById(jobAdvertisementId).orElseThrow(
				()-> new IllegalArgumentException("Girilen id ile işleşen bir ilan bulunamadı"+ jobAdvertisementId));
		
		jobAdvertisement.setStatus(false);
		jobAdvertisementDao.saveAndFlush(jobAdvertisement);
		
		return new SuccessResult("İş ilanı durumu pasife çekildi");
	}

	
	
	
	

}
