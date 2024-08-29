package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.dao.StudentSorting;
@Component
public class Runnner implements CommandLineRunner {
	@Autowired
  private StudentSorting repo;
	@Override
	public void run(String... args) throws Exception {
repo.findAll(PageRequest.of(2, 2)).forEach(System.out::println);//10,11
repo.findAll(PageRequest.of(3, 3)).forEach(System.out::println);//15,16
repo.findAll(PageRequest.of(4,2)).forEach(System.out::println);//14,15
  Page<Student>page = repo.findAll(PageRequest.of(2, 4));
page.forEach(System.out::println);
  System.out.println(page.isFirst());
  System.out.println(page.isLast());
  System.out.println(page.hasNext());
  System.out.println(page.hasPrevious());
  System.out.println(page.getTotalPages());
  System.out.println(page.getTotalElements());
  System.out.println(page.getSize());
  System.out.println(page.getContent());
	}

}
