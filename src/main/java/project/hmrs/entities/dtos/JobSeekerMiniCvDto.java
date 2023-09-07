package project.hmrs.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerMiniCvDto {
	
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
	private String languageName;
	private int languageLevel;
	private String knownTechnology;
	private String githubLink;
	private String linkedinLink;
	private String imagePath;
	private String coverLetter;
}
