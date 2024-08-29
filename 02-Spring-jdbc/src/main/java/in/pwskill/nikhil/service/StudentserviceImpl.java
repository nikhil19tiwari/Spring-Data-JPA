package in.pwskill.nikhil.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskill.nikhil.dao.IStudentDao;
@Service("service")
public class StudentserviceImpl implements IStudentservice{
@Autowired
private IStudentDao dao;
	@Override
	public void insert(Integer sid, String sname, Integer sage, String saddress) {
     dao.insert(sid, sname, sage, saddress);
	}
	@Override
	public int delete(Integer sid) {
		return dao.delete(sid);
	}
	@Override
	public void update(Integer sid, String sname) {
		// TODO Auto-generated method stub
		dao.update(sid,sname);
	}
	@Override
	public int studentCount() {
		// TODO Auto-generated method stub
		return dao.studentCount();
	}
	@Override
	public Map<String, Object> getStudentDetails(Integer sid) {
		// TODO Auto-generated method stub
		return dao.getStudntDetails(sid);
	}
	@Override
	public List<Map<String, Object>> getAllDetail(String ds1,String ds2) {
		// TODO Auto-generated method stub
		return dao.getAllObject(ds1,ds2);
	}

}
