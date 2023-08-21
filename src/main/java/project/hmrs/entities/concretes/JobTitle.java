package project.hmrs.entities.concretes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="job_titles")
@Data
public class JobTitle  {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name = "titels")
	private String title;
	
	public JobTitle() {}
	
	public JobTitle(int id, String title) {
		this();
		this.id = id;
		this.title = title;
	}
}
