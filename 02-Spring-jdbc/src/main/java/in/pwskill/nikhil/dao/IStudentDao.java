package in.pwskill.nikhil.dao;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
	public void insert(Integer sid,String sname,Integer sage,String saddress);
	public int delete(Integer sid);
	public void update(Integer sid,String sname);
	public int  studentCount();
	public Map<String,Object>getStudntDetails(Integer sid);
	public List<Map<String,Object>>getAllObject(String ds1,String ds2);
}
