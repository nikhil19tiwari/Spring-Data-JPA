package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.EmployeeHQL;
import in.pwskill.nikhil.dao.CustomHQL;
@Component
public class HQLRunner implements CommandLineRunner {
	@Autowired
private CustomHQL repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       repo.fetchBiId(1).forEach(System.out::println);
       repo.fetchAllId(1).forEach(System.out::println);
       repo.deleteRec(2);
       repo.fetchAllId(1).forEach(System.out::println);
       repo.updateRec(1, 2);
       repo.fetchAllId(1).forEach(System.out::println);
	}

}
