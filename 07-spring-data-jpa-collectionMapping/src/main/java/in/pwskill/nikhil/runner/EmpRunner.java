package in.pwskill.nikhil.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Employee;
import in.pwskill.nikhil.dao.EmployeeRepo;
@Component
public class EmpRunner implements CommandLineRunner {
	
	@Autowired
    private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
    Employee emp = new Employee();
   emp.setEid(1);
   emp.setEname("nikhil");
   emp.setEage(21);
   emp.setEddress("MI");
   emp.setFriends(List.of("rippan","vivek","harsh","priyanshu"));
   emp.setPhoneNumber(Set.of(122344, 2178567, 96568758, 2565473));
   Map<String,Integer> map = new HashMap<>();
   map.put("SBI", 23398254);
   map.put("UNION", 358975);
   map.put("BOB",685789);
   map.put("CENERA", 7698754);
   emp.setBankDetails(map);
   repo.save(emp);
   
	}

}
