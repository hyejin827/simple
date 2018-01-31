package si.mp.le.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import si.mp.le.user.dao.UserDAO;
import si.mp.le.user.vo.User;

@Service("user.us")
public class UserService {

	
	private UserDAO udao;
	
	@Autowired
	public UserService(@Qualifier("userDAO")UserDAO udao) {
		this.udao = udao;
	}
	
	@Autowired
	public void setUserDAO(UserDAO udao) {
		this.udao = udao;
	}
	
	public User getUser() {
		return udao.selectUser();
	}
	
	public List<User> getUserList(){
		return udao.selectUserList();
	}
}
