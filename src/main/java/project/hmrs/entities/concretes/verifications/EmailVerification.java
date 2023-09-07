package project.hmrs.entities.concretes.verifications;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="verification_codes")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class EmailVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verfication_code")
	private String verificationCode;
	
	@Column(name="verfication_date")
	private Date verificationDate;
}
