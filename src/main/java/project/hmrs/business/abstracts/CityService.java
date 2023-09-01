package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.City;

public interface CityService {

	Result add(City city);
	DataResult<List<City>> getAll();
}
