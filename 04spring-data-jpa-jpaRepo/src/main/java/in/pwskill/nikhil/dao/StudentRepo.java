package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
