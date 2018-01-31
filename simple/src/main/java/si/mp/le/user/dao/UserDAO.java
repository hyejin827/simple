package si.mp.le.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import si.mp.le.user.vo.User;

@Repository("user.udao")
public class UserDAO {
	
	@Autowired
	private User user;
	
	@Autowired
	private BasicDataSource bds;
	
	public User selectUser() {
		String sql = "select * from user_info";
		try {
			Connection con = bds.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setUiAge(rs.getInt("uiage"));
				user.setUiName(rs.getString("uiname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	  public List<User> selectUserList() {
	      String sql = "select * from user_info";
	      List<User> userList = new ArrayList<User>();
	      try {
	         Connection con = bds.getConnection();
	         PreparedStatement ps=con.prepareStatement(sql);
	         ResultSet rs=ps.executeQuery();
	         while(rs.next()) {
	            User u=new User();
	            u.setUiAge(rs.getInt("uiAge"));
	            u.setUiName(rs.getString("uiname"));
	            userList.add(u);
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      return userList;
	   }
	
//	public ArrayList<User> selectUserList() {
//		ArrayList<User> userList = new ArrayList<User>();
//		for(int i=1;i<5;i++) {
//			user = new User();
//			user.setUiAge(i);
//			user.setUiName("박혜진"+i);
//			userList.add(user);
//		}
//		return userList;
//	}
}
