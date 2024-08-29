package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Department;

public interface DepartmentJpa extends JpaRepository<Department, Integer> {

}
