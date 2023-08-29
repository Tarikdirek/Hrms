package project.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hmrs.entities.concretes.users.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
