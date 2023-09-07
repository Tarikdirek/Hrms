package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerWebAddress;

public interface JobSeekerWebAddressDao extends JpaRepository<JobSeekerWebAddress, Integer> {

}
