package project.hmrs.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.cvInformations.JobSeekerLanguageInfo;

public interface JobSeekerLanguageInfoDao extends JpaRepository<JobSeekerLanguageInfo, Integer> {

}
