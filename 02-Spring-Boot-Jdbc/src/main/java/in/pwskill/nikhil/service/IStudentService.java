package in.pwskill.nikhil.service;

import java.util.List;

import in.pwskill.nikhil.bean.StudentDTO;

public interface IStudentService {
public StudentDTO getResult(Integer sid);
public List<StudentDTO> getAllResult(String ds1,String ds2);
}
