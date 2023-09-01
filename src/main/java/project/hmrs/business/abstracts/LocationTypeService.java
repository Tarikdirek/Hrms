package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.LocationType;

public interface LocationTypeService {

	Result add(LocationType locationType);
	DataResult<List<LocationType>> getAll();
}
