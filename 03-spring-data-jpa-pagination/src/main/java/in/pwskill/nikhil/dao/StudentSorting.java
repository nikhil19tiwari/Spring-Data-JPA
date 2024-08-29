package in.pwskill.nikhil.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.pwskill.nikhil.bean.Student;

public interface StudentSorting extends PagingAndSortingRepository<Student, Integer> {
// SORTING OPERATION
}
