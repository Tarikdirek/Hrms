package project.hmrs.entities.concretes.cvInformations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import project.hmrs.entities.concretes.cvInformations.enums.StorageType;
import project.hmrs.entities.concretes.users.JobSeeker;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "job_seeker_image_infos")
@Getter
@Setter
public class JobSeekerImageInfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "image_name")
	private String imageName;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name = "storage_name")
	@Enumerated(EnumType.STRING)
	private StorageType storageName;
	
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
}
