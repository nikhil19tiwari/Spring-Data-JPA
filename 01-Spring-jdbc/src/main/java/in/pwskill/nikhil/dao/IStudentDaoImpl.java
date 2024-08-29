package in.pwskill.nikhil.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class IStudentDaoImpl implements IStudentDao {
private static final String INSERT_SQL_QUERY = "insert into student values(?,?,?,?)";
private static final String DELETE_SQL_QUERY = "delete from student where sid = ?";
private static final String UPDATE_SQL_QUERY = "update student set sname = ? where sid = ?";
private static final String COUNT_THE_STUDENT = "select count(*) from student";
private static final String GET_STUDENT_DETAILS = "select * from student  where sid = ?";
private static final String SQL_SELECT_DESG = "select * from student where sname in (?,?)order by sid";
@Autowired
private JdbcTemplate templete;
	@Override
	public void insert(Integer sid, String sname, Integer sage, String saddress) {
		templete.update(INSERT_SQL_QUERY, sid,sname,sage,saddress);
	}
	@Override
	public int delete(Integer sid) {
		return templete.update(DELETE_SQL_QUERY,sid);
	}
	@Override
	public void update(Integer sid, String sname) {
      templete.update(UPDATE_SQL_QUERY,sname,sid);
	}
	@Override
	public int studentCount() {
		// TODO Auto-generated method stub
		return templete.queryForObject(COUNT_THE_STUDENT,Integer.class);
	}
	@Override
	public Map<String, Object> getStudntDetails(Integer sid) {
		// TODO Auto-generated method stub
		return templete.queryForMap(GET_STUDENT_DETAILS,sid);
	}
	@Override
	public List<Map<String, Object>> getAllObject(String ds1,String ds2) {
		// TODO Auto-generated method stub
		return templete.queryForList(SQL_SELECT_DESG,ds1,ds2);
	}

}
