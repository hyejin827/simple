package si.mp.le.emp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmpDAO {
	
	private JdbcTemplate jt;
	
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void Test() {
		try {
			Connection c = jt.getDataSource().getConnection();
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Emp> selectEmpList(){
		String sql = "select * from emp";
		return jt.query(sql, new BeanPropertyRowMapper(Emp.class));
	}
	
	public Emp selectEmp(int empNo) {
		String sql = "select * from emp where empno=?";
		return jt.queryForObject(sql, new Object[] {empNo}, new BeanPropertyRowMapper(Emp.class));
	}
	//insert update delete
	public void insertEmp(String empName, int empSal) {
		String sql = "insert into emp (empname, empsal) values(?,?)";
		jt.update(sql, empName, empSal);
		System.out.println("추가 성공!");
	}
	
	public void updateEmp(String empName, int empSal, int empNo) {
		String sql = "update emp set empname=?, empsal=? where empno=?";
		jt.update(sql, empName, empSal, empNo);
		System.out.println("수정 성공!");
	}
	
	public void deleteEmp(String empName) {
		String sql = "delete from emp where empname=?";
		jt.update(sql, empName);
		System.out.println("삭제 성공!");
	}
}
