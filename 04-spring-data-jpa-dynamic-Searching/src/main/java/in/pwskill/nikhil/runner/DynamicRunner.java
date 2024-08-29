package in.pwskill.nikhil.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.dao.StudentDynamic;
@Component
public class DynamicRunner implements CommandLineRunner {
	@Autowired
 private StudentDynamic repo;
	@Override
	public void run(String... args) throws Exception {
   Student s = new Student();
   s.setSaddress("hydrabad");
   s.setSage(26);
repo.findAll(Example.of(s)).forEach(System.out::println);
	}

}
