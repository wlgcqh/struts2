package com.qiheng.struts2;

import java.util.Date;

import com.qiheng.DAO.IUserDAO;
import com.qiheng.factory.UserDAOFactory;

public class LoginAction {
	private String username;
	
	private String password;
	
	private int age;
	
	private Date date;

	private IUserDAO userDAO;
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{
		
		try{
			userDAO = UserDAOFactory.getDAOInstance();
			if(userDAO.isCorrect(username, password)){
				return "success";
			}
		}catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
		
		
		
		return "error";
	}
}
