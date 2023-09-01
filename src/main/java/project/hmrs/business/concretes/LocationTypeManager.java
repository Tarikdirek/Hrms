package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.LocationTypeService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.LocationTypeDao;
import project.hmrs.entities.concretes.LocationType;

@Service
public class LocationTypeManager implements LocationTypeService {

	LocationTypeDao locationTypeDao;
	
	@Autowired
	public LocationTypeManager(LocationTypeDao locationTypeDao) {
		this.locationTypeDao = locationTypeDao;
	}


	@Override
	public Result add(LocationType locationType) {
		locationTypeDao.save(locationType);
		return new SuccessResult("Lokasyon başarılı bir şekilde kaydedildi");
	}


	@Override
	public DataResult<List<LocationType>> getAll() {
		var result = locationTypeDao.findAll();
		return new SuccessDataResult<List<LocationType>>(result,"Lokasyonlar başarılı bir şekilde listelendi");
	}

}
