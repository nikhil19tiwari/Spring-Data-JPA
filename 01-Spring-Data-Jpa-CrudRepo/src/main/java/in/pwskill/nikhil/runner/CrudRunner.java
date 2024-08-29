package in.pwskill.nikhil.runner;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.repo.StudentCrud;
@Component
public class CrudRunner implements CommandLineRunner {
	@Autowired
private StudentCrud repo;
	@Override
	public void run(String... args) throws Exception {
    //Crud opration
		Student s = new Student(1,"nikhil",21,"MI");
		//repo.save(s);
		repo.saveAll(List.of(new Student(2,"tiwari",22,"NSP"),
				             new Student(3,"satya",44,"Bandra"), 
				             new Student(4,"laxmi",84,"Malad"))).forEach(System.out::println);;
		
		repo.findAll().forEach(System.out::println);
		Optional<Student>op = repo.findById(1);
		System.out.println(op);
		repo.findAllById(List.of(3, 4)).forEach(System.out::println);
		System.out.println("There are "+repo.count()+"  "+"record present in Repo_Student");
		boolean b = repo.existsById(3);
		System.out.println(b);
//		repo.delete(s);
//		repo.deleteAll();
//		repo.deleteById(2);
//		repo.deleteAllById(List.of(1, 2));
	}

}
