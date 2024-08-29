package in.pwskill.nikhil.runner;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Department;
import in.pwskill.nikhil.bean.Employee;
import in.pwskill.nikhil.dao.DepartmentJpa;
import in.pwskill.nikhil.dao.EmployeeJpa;
@Component
public class ManyToOneRunner implements CommandLineRunner {
	@Autowired
    private EmployeeJpa erepo;
	
	@Autowired
    private DepartmentJpa drepo;
	@Override
	public void run(String... args) throws Exception {
		Department d1= new Department(1,"dev","MI");
		Department d2= new Department(2,"qa","Malad");
		Department d3= new Department(3,"dev","Bandra");
		Department d4 =new Department(4,"test","MI");
		Department d5= new Department(5,"test","Mahim");
		
		drepo.saveAll(List.of(d1, d2, d3, d4,d5));
		
		Employee e1 = new Employee(1,"nikhil",21,"MI",d1);
		Employee e2 = new Employee(2,"ram",23,"MI",d3);
		Employee e3 = new Employee(3,"babu",22,"MI",d2);
		Employee e4 = new Employee(4,"stya",19,"MI",d5);
		Employee e5 = new Employee(5,"laxmi",71,"MI",d2);
		Employee e6 = new Employee(6,"nikhil",13,"MI",d3);
		Employee e7 = new Employee(7,"raj",21,"MI",d2);
		Employee e8 = new Employee(8,"raju",27,"MI",d1);
		Employee e9 = new Employee(9,"abhishek",25,"MI",d4);
		
		erepo.saveAll(List.of(e1, e2,e3, e4, e5, e6, e7, e8,e9));
		
	}

}
