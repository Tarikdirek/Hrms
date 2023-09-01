package project.hmrs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="location_types")
@Data
@JsonIgnoreProperties({"hibrnateLazyInitializer","handler","jobAdvertisements"})
public class LocationType {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "location_name")
	private String locationName;
	
	@OneToMany(mappedBy = "locationType")
	private List<JobAdvertisement> jobAdvertisements;
}
