package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import java.util.List; // Correct import for List

import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.dao.StudentRepo;

@Component
public class Runnner implements CommandLineRunner {
    
    @Autowired
    private StudentRepo repo;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println(repo.count());

        List<Student> list = repo.findAll(); // Corrected List import and type
        list.forEach(System.out::println);

        repo.findById(6).ifPresentOrElse(System.out::println, () -> {
            System.out.println("no record found");
        });
    }
}
