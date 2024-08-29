package in.pwskill.nikhil.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Model;
import in.pwskill.nikhil.bean.Product;
import in.pwskill.nikhil.dao.ModelJpa;
import in.pwskill.nikhil.dao.ProductJpa;
@Component
public class OneToManyRunner implements CommandLineRunner {
	@Autowired
   private ModelJpa repo;
	@Autowired
   private ProductJpa prepo;
	@Override
	public void run(String... args) throws Exception {
    
    Model m1 = new Model(1,"oppo",1.1);
    Model m2 = new Model(2,"vivo",1.2);
    Model m3 = new Model(3,"apple",2.1);
    Model m4 = new Model(4,"redmi",1.0);
    Model m5 = new Model(5,"oppo",1.1);
    Model m6 = new Model(6,"vivo",1.6);
    Model m7 = new Model(7,"oppo",2.1);
    Model m8 = new Model(8,"MI",3.1);
    
    repo.saveAll(List.of(m1, m2, m3, m4, m5, m6, m7, m8));
    
     Product p1 = new Product(1,"touch",10000,Arrays.asList(m1,m2,m6));
     Product p2 = new Product(2,"keypad",12000,Arrays.asList(m1,m3,m5,m7));
     Product p3 = new Product(3,"iphone",17000,Arrays.asList(m4,m2,m8));
      prepo.saveAll(List.of(p1, p2, p3));
     
	}

}
