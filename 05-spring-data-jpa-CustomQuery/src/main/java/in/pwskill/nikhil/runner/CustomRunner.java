package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.dao.JpaCustomQuery;
@Component
public class CustomRunner implements CommandLineRunner {
	@Autowired
private JpaCustomQuery repo;
	@Override
	public void run(String... args) throws Exception {
    repo.findBySname("kaju").forEach(System.out::println);
	repo.findBySaddress("malad").forEach(System.out::println);
	repo.findBySnameAndSage("nikhil", 20).forEach(System.out::println);
	repo.findBySnameOrSaddress("nikil", "nsp").forEach(System.out::println);
	repo.findBySageBetween(23, 28).forEach(System.out::println);
	repo.findBySageGreaterThan(25).forEach(System.out::println);
	repo.findBySageGreaterThanEqual(25).forEach(System.out::println);
	repo.findBySageLessThan(25).forEach(System.out::println);;
	repo.findBySageLessThanEqual(23).forEach(System.out::println);;;
	repo.findBySageIsNull().forEach(System.out::println);
	repo.findBySageIsNotNull().forEach(System.out::println);
	repo.findBySnameLike("satya").forEach(System.out::println);
	repo.findBySnameNotLike("nikhil").forEach(System.out::println);
	repo.findBySnameOrderBySage("nikhil").forEach(System.out::println);
	
	
	
	
	
	
	
	
	}

}
