package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.core.utilities.results.DataResult;
import project.hmrs.core.utilities.results.Result;
import project.hmrs.entities.concretes.users.Employer;

public interface EmployerService {

	Result add(Employer employer);
	Result delete(Employer employer);
	Result update(Employer employer);
	DataResult<List<Employer>> getAll();
}
