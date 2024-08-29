package in.pwskill.nikhil.repo;

import org.springframework.data.repository.CrudRepository;

import in.pwskill.nikhil.bean.Student;

public interface StudentCrud extends CrudRepository<Student, Integer> {
 // C  R  U  D operation
}
