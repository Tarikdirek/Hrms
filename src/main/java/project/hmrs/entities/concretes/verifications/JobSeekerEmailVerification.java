package project.hmrs.entities.concretes.verifications;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import project.hmrs.entities.concretes.users.JobSeeker;

@Entity
@Table(name="job_seekers_verifications")
@Getter
@Setter
public class JobSeekerEmailVerification extends EmailVerification {
	
	
	@OneToOne
	@JoinColumn(name ="job_seeker_id" )
	@ToString.Exclude
	
	private JobSeeker jobSeekerId;

}
