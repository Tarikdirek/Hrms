package project.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hmrs.business.abstracts.CityService;
import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.core.utilities.results.SuccessDataResult;
import project.hmrs.core.utilities.results.SuccessResult;
import project.hmrs.dataAccess.abstracts.CityDao;
import project.hmrs.entities.concretes.City;

@Service
public class CityManager implements CityService {

	CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		cityDao.save(city);
		return new SuccessResult("Şehir başarılı bir şekilde kaydedildi");
	}

	@Override
	public DataResult<List<City>> getAll() {
		var result = cityDao.findAll();
		return new SuccessDataResult<List<City>>(result, "Şehirler başarılı bir şekilde listelendi");
	}

}
