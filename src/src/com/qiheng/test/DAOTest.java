package com.qiheng.test;

import java.util.Date;

import com.qiheng.DAO.IUserDAO;
import com.qiheng.bean.User;
import com.qiheng.factory.UserDAOFactory;

public class DAOTest {
	public static void main(String[] args) throws Exception {
		
		User user = new User();
		
		
		IUserDAO dao = UserDAOFactory.getDAOInstance();
		user=dao.findByUsername("123");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println(user.getBirthday());
		System.out.println(user.getGraduation());
		
	}
}
