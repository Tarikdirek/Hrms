package project.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.LocationType;

public interface LocationTypeDao extends JpaRepository<LocationType, Integer> {

}
