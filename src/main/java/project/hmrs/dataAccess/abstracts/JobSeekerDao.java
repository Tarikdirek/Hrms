package project.hmrs.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.users.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

	JobSeeker findByEmail(String name);
	JobSeeker findByNationalId(String nationalId);
}
