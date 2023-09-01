package project.hmrs.entities.concretes.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import project.hmrs.entities.concretes.JobAdvertisement;

@Entity
@Table(name="employers")
@Data
@JsonIgnoreProperties({"hibrnateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User {


	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="phone_num")
	private String phoneNum;
	
	@OneToMany
	@JoinColumn(name="employer")
	private List<JobAdvertisement> jobAdvertisements;
}
