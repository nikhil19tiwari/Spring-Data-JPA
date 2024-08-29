package in.pwskill.nikhil.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.dao.StudentSorting;
@Component
public class Runnner implements CommandLineRunner {
	@Autowired
  private StudentSorting repo;
	@Override
	public void run(String... args) throws Exception {
    repo.findAll(Sort.by("saddress")).forEach(System.out::println);;
    repo.findAll(Sort.by(Direction.DESC, "saddress")).forEach(System.out::println);;
    repo.findAll(Sort.by("sname","saddress")).forEach(System.out::println);
    repo.findAll(Sort.by(Direction.DESC, "sage","sname")).forEach(System.out::println);
    repo.findAll(Sort.by(Order.asc("sage"),Order.desc("sid"))).forEach(System.out::println);;
	}

}
