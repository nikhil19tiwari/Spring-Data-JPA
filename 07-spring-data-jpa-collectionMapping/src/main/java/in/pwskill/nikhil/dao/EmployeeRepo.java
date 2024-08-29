package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
