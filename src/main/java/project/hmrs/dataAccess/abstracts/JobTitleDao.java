package project.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
