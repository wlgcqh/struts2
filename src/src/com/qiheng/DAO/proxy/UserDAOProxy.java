package com.qiheng.DAO.proxy;

import com.qiheng.DAO.IUserDAO;
import com.qiheng.DAO.impl.UserDAOImpl;
import com.qiheng.bean.User;
import com.qiheng.dbc.DataBaseConnection;

public class UserDAOProxy implements IUserDAO {
	
	private DataBaseConnection dbc = null;
	
	private IUserDAO dao = null;
	
	

	public UserDAOProxy() throws Exception {
		this.dbc = new DataBaseConnection();
		
		this.dao = new UserDAOImpl(this.dbc.getConn());
		
	}

	public boolean doCreate(User user) throws Exception {
		
		boolean flag = false;
		try {
			if(this.dao.findByUsername(user.getUsername())==null){
				flag = this.dao.doCreate(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.dbc.close();
		}
		
		
		
		return flag;
	}

	public User findByUsername(String username) throws Exception {
		User user = null;
		
		try {
			user = this.dao.findByUsername(username);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.dbc.close();
		}
		
		
		return user;
	}

	public boolean isCorrect(String username, String password) throws Exception {
//		boolean flag = false;
//		try {
//			if(this.dao.isCorrect(username, password)){
//				flag = true;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally{
//			this.dbc.close();
//		}
//		return flag;
		boolean flag= this.dao.isCorrect(username, password);
		this.dbc.close();
		return flag;
		
	}

}
