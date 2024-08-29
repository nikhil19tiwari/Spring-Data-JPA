package in.pwskill.nikhil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskill.nikhil.bean.StudentBo;
import in.pwskill.nikhil.bean.StudentDTO;
import in.pwskill.nikhil.dao.IStudentDao;
@Service("service")
public class StudentServiceImpl implements IStudentService {
	@Autowired
 private IStudentDao dao;
	@Override
	public StudentDTO getResult(Integer sid) {
		// TODO Auto-generated method stub
		StudentBo bo = dao.getResult(sid);
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	@Override
	public List<StudentDTO> getAllResult(String ds1, String ds2) {
		List<StudentBo> bo = dao.getAllResult(ds1, ds2);
		ArrayList<StudentDTO>dto = new ArrayList<>();
		bo.forEach(b->{
			StudentDTO d = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.add(d);
		});
		return dto;
	}
}
