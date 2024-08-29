package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Product;
import in.pwskill.nikhil.bean.Model;
import in.pwskill.nikhil.dao.ModelJpa;
import in.pwskill.nikhil.dao.ProductJpa;

import java.util.Arrays;
import java.util.List;

@Component
public class OneToMany implements CommandLineRunner {

    @Autowired
    private ProductJpa prepo;
    
    @Autowired
    private ModelJpa mrepo;

    @Override
    public void run(String... args) throws Exception {
        Model m1 = new Model(null, "oppo", 1.0);
        Model m2 = new Model(null, "vivo", 1.1);
        Model m3 = new Model(null, "redmi", 1.2);
        Model m4 = new Model(null,"oppo",1.3);
        Model m5= new Model(null,"xmomi",1.0);
        Model m6 = new Model(null,"nokia",2.2);
        Model m7 = new Model(null,"vivo",1.0);
        Model m8 = new Model(null,"poco",2.3);
       mrepo.saveAll(List.of(m1, m2, m3, m4, m5, m6, m7, m8));
       
    }
}
