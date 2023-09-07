package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerTalent;

public interface JobSeekerTalentDao extends JpaRepository<JobSeekerTalent, Integer> {

}
