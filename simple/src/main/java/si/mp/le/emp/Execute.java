package si.mp.le.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("emp/ioc.xml");
//		EmpDAO ed = (EmpDAO)ac.getBean("edao"); 
		EmpService es = (EmpService)ac.getBean("es");
//		ed.Test();
//		System.out.println(ed.selectEmpList());
//		for(Emp e : ed.selectEmpList()) {
//			System.out.println(e);
//		}
//		System.out.println(ed.selectEmp(1));
		
		System.out.println(es.getEmpList());
//		es.insertEmp("바보", 900);
		es.deleteEmp("바보");
		
		
	}
}
