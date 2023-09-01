package project.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
