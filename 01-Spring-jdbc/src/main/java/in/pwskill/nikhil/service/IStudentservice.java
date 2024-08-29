package in.pwskill.nikhil.service;

import java.util.List;
import java.util.Map;

public interface IStudentservice {
public void insert(Integer sid,String sname,Integer sage,String saddress);
public int delete(Integer sid);
public void update(Integer sid,String sname);
public int studentCount();
public Map<String,Object>getStudentDetails(Integer sid);
public List<Map<String,Object>>getAllDetail(String ds1,String ds2);
}
