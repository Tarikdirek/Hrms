package project.hmrs.entities.concretes.users;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name="job_seekers")
@Data

public class JobSeeker extends User {
	
	
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="birth_date")
	private Date birthDate;
}
