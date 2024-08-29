package in.pwskill.nikhil.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Adharcard;
import in.pwskill.nikhil.bean.Person;
import in.pwskill.nikhil.dao.Adharcardjpa;
import in.pwskill.nikhil.dao.PersonJpa;
@Component
public class OneToOneRunner implements CommandLineRunner {
    @Autowired
	private PersonJpa prepo;
    @Autowired
	private Adharcardjpa arepo;
	@Override
	public void run(String... args) throws Exception {
		Adharcard a1 = new Adharcard(1,"Nikhil",21,"MI");
		Adharcard a2 = new Adharcard(2,"Tiwari",23,"NSP");
		Adharcard a3 = new Adharcard(3,"Ram",11,"MALAD");
		Adharcard a4 = new Adharcard(4,"Babu",18,"MALAD");
		arepo.saveAll(List.of(a1, a2,a3,a4));
		
		Person p1 = new Person(1,"nikhil",21,"MI",a1) ;
		Person p2 = new Person(1,"nikhil",21,"MI",a2) ;
		Person p3 = new Person(1,"nikhil",21,"MI",a3) ;		
		Person p4 = new Person(1,"nikhil",21,"MI",a4) ;
		
		prepo.saveAll(List.of(p1,p2,p3,p4));
		
	}

}
