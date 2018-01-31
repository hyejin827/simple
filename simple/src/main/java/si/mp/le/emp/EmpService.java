package si.mp.le.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmpDAO edao;

	public List<Emp> getEmpList(){
		return edao.selectEmpList();
	}
	
	public Emp getEmp(int empNo) {
		return edao.selectEmp(empNo);
	}
	
	public void insertEmp(String empName, int empSal) {
		edao.insertEmp(empName, empSal);
	}
	
	public void updateEmp(String empName, int empSal, int empNo) {
		edao.updateEmp(empName, empSal, empNo);
	}
	
	public void deleteEmp(String empName) {
		edao.deleteEmp(empName);
	}
}
