package project.hmrs.business.abstracts;

import java.util.List;

import project.hmrs.entities.concretes.JobTitle;

public interface JobTitleService {
	
	void add(JobTitle jobTitle);
	void delete(JobTitle jobTitle);
	void update(JobTitle jobTitle);
	List<JobTitle> getAll();
}
