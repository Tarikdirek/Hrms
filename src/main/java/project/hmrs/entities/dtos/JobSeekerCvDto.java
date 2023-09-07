package project.hmrs.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobSeekerCvDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String degree;
	private String department;
	private String schoolName;
	private Date startDate;
	private Date endDate;
	private String nameOfInstution;
	private String role;
	private Date jobStartDate;
	private Date jobEndDate;
	private String imagePath;
	private int languageLevel;
	private String languageName;
	public String knownTechnology;
	public String linkedinLink;
	public String githubLink;
	public String coverLetter;
	
	
	
	
}
