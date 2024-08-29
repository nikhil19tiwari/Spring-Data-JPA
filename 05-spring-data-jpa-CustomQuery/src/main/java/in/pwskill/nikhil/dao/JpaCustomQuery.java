package in.pwskill.nikhil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Student;

public interface JpaCustomQuery extends JpaRepository<Student, Integer> {
// Custom query operation
	// For Entity Query
	
// 1. select * from studentRepo where sname = ?;
	List<Student> findBySname(String name);
// 2. select * from studentRepo where  saddress = ?;
	List<Student> findBySaddress(String saddress);
// 3. select * from studentRepo where sname = ? and sage = ?; 
	List<Student> findBySnameAndSage(String name,Integer age);
// 4. select * from studentRepo where sname = ? or sage = ?;
	List<Student> findBySnameOrSaddress(String name,String address);
// 5. select * from studentRepo where sage between (?,?);
	List<Student> findBySageBetween(Integer a,Integer b);
// 6. select * from studentRepo where sage > ?;
	List<Student> findBySageGreaterThan(Integer age);
// 7. select * from studentRepo where sage >= ?;
	List<Student> findBySageGreaterThanEqual(Integer age);
// 8. select * from studentRepo where sage < ?;
	List<Student> findBySageLessThan(Integer age);
// 9. select * from studentRepo where sage <= ?;
	List<Student> findBySageLessThanEqual(Integer age);
// 10. select * from studentRepo where sage = null;
	List<Student> findBySageIsNull();
// 11. select * from studentRepo where sage != null;
	List<Student> findBySageIsNotNull();
// 12. select * from studentRepo where sname like = ?;
	List<Student> findBySnameLike(String name);
// 13. select * from studentRepo where firstName like = ?;
	List<Student> findBySnameNotLike(String name);
// 14. select * from studentRepo where is sname=  ? ordered by asc;
	List<Student> findBySnameOrderBySage(String name);
	
	
	
	
	
	
	
	
	
	
}
