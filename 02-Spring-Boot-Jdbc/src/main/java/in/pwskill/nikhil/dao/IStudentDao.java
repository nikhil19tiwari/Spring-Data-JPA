package in.pwskill.nikhil.dao;

import java.util.List;

import in.pwskill.nikhil.bean.StudentBo;

public interface IStudentDao {
public StudentBo getResult(Integer sid);
public List<StudentBo>getAllResult(String ds1,String ds2);
}
