package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerExperienceInfo;

public interface JobSeekerExperienceInfoDao extends JpaRepository<JobSeekerExperienceInfo, Integer> {

}
