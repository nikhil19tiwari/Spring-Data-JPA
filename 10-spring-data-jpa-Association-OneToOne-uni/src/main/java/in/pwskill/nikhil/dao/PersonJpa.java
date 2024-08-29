package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Person;

public interface PersonJpa extends JpaRepository<Person, Integer> {

}
