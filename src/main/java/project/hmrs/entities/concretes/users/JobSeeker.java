package project.hmrs.entities.concretes.users;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import project.hmrs.entities.concretes.cvInformations.JobSeekerCoverLetter;
import project.hmrs.entities.concretes.cvInformations.JobSeekerEducationInfo;
import project.hmrs.entities.concretes.cvInformations.JobSeekerExperienceInfo;
import project.hmrs.entities.concretes.cvInformations.JobSeekerImageInfo;
import project.hmrs.entities.concretes.cvInformations.JobSeekerLanguageInfo;
import project.hmrs.entities.concretes.cvInformations.JobSeekerTalent;
import project.hmrs.entities.concretes.cvInformations.JobSeekerWebAddress;



@Entity
@Table(name="job_seekers")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobSeekerExperienceInfos", "jobSeekerImageInfos", 
	"jobSeekerLanguageInfos", 
	"jobSeekerEducationInfos", "jobSeekerTalents","jobSeekerWebAddress","jobSeekerCoverLetter"})
public class JobSeeker extends User {
	
	
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@OneToOne(mappedBy = "jobSeeker")
	private JobSeekerCoverLetter jobSeekerCoverLetter;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerEducationInfo> jobSeekerEducationInfos;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerExperienceInfo> jobSeekerExperienceInfos;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerImageInfo> jobSeekerImageInfos;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerLanguageInfo> jobSeekerLanguageInfos;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerTalent> jobSeekerTalents;
	
	@OneToOne(mappedBy = "jobSeeker")
	private JobSeekerWebAddress jobSeekerWebAddress;
}
