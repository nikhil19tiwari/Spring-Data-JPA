package in.pwskill.nikhil.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.service.IStudentService;

@Component
public class runner implements CommandLineRunner {

    @Autowired
    private IStudentService service;

    @Override
    public void run(String... args) throws Exception {
//        StudentDTO dto = service.getResult(4);
//        System.out.println(dto);
        service.getAllResult("NIKHIL", "sachin").forEach(System.out::println);
    }
}
