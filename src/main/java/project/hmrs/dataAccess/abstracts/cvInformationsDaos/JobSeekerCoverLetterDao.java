package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerCoverLetter;

public interface JobSeekerCoverLetterDao extends JpaRepository<JobSeekerCoverLetter, Integer> {

}
