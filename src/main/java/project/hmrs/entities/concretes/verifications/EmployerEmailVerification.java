package project.hmrs.entities.concretes.verifications;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import project.hmrs.entities.concretes.users.Employer;


@Entity
@Table(name="employers_verification_codes")
@Getter
@Setter
public class EmployerEmailVerification extends EmailVerification {
	
	@OneToOne
	@JoinColumn(name = "employer_id")
	@ToString.Exclude
	private Employer employer;
}
