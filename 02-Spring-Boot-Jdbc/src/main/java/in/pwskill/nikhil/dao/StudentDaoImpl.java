package in.pwskill.nikhil.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.pwskill.nikhil.bean.StudentBo;

@Repository("dao")
public class StudentDaoImpl implements IStudentDao {

    private static final String GET_RESULT = "select * from student where sid = ?";

	private static final String SQL_QUERY = "select * from student where sname in(?,?)order by sid";

    @Autowired
    private JdbcTemplate template;

    @Override
    public StudentBo getResult(Integer sid) {
        return template.queryForObject(GET_RESULT, new RowMapper<StudentBo>() {

            @Override
            public StudentBo mapRow(ResultSet rs, int rowNum) throws SQLException {
                StudentBo bo = new StudentBo();
                bo.setSid(rs.getInt("sid"));
                bo.setSaddress(rs.getString("saddress"));
                bo.setSage(rs.getInt("sage"));
                bo.setSname(rs.getString("sname"));
                return bo;
            }
        }, sid);
    }

	@Override
	public List<StudentBo> getAllResult(String ds1, String ds2) {
		// TODO Auto-generated method stub
		return template.query(SQL_QUERY, new ResultSetExtractor<List<StudentBo>>() {
        ArrayList<StudentBo>res = new ArrayList<>();
			@Override
			public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
while(rs.next()) {
	StudentBo bo = new StudentBo();
	  bo.setSid(rs.getInt("sid"));
      bo.setSaddress(rs.getString("saddress"));
      bo.setSage(rs.getInt("sage"));
      bo.setSname(rs.getString("sname"));
      res.add(bo);
}
				return res;
			}


		}, ds1,ds2);
	}
}
