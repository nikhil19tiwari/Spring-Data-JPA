package in.pwskill.nikhil.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskill.nikhil.bean.Course;
import in.pwskill.nikhil.bean.Student;
import in.pwskill.nikhil.dao.CourceJpa;
import in.pwskill.nikhil.dao.StudentJpa;

@Component
public class ManyToManyRunner implements CommandLineRunner {

    @Autowired
    private StudentJpa studentRepository;

    @Autowired
    private CourceJpa courseRepository;

    @Override
    public void run(String... args) throws Exception {
        Course c1 = new Course(1, "java", 6000, "sep");
        Course c2 = new Course(2, "web", 6000, "sep");
        Course c3 = new Course(3, "java", 6000, "oct");
        Course c4 = new Course(4, "java", 6000, "sep");
        Course c5 = new Course(5, "java", 6000, "nov");

        List<Course> courses = Arrays.asList(c1, c2, c3, c4, c5);
        courseRepository.saveAll(courses);

        Student s1 = new Student(1, "nikhil", 21, "MI", courses.subList(0, 1));
        Student s2 = new Student(2, "tiwari", 22, "NSP", courses.subList(1, 2));
        Student s3 = new Student(3, "ram", 23, "BANDRA", courses.subList(2, 3));
        Student s4 = new Student(4, "babu", 25, "MALAD", courses.subList(3, 4));
        Student s5 = new Student(5, "kishan", 26, "DADAR", courses.subList(4, 5));

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
        studentRepository.saveAll(students);
    }
}
