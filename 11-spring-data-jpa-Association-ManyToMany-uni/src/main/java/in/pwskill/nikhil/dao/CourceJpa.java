package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Course;

public interface CourceJpa extends JpaRepository<Course, Integer> {

}
