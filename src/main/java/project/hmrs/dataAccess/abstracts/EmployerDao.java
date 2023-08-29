package project.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.users.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
