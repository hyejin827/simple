package si.mp.le;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import si.mp.le.user.dao.UserDAO;
import si.mp.le.user.service.UserService;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		UserService us = (UserService)ac.getBean("userService");
		System.out.println(us.getUser());
		System.out.println(us.getUserList());
	}
}
