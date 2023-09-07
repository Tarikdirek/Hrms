package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerImageInfo;

public interface JobSeekerImageInfoDao extends JpaRepository<JobSeekerImageInfo, Integer> {

}
