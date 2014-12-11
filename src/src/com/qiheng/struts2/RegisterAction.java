package com.qiheng.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.DAO.IUserDAO;
import com.qiheng.bean.User;
import com.qiheng.exception.PasswordException;
import com.qiheng.exception.UsernameException;
import com.qiheng.factory.UserDAOFactory;

public class RegisterAction extends ActionSupport {
	
	private String username;
	
	private String password;
	
	private int age;
	
	private Date birthday;
	
	private Date graduation;
	
	private IUserDAO userDAO = null;
	
	

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


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getGraduation() {
		return graduation;
	}

	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}
	
	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAge(age);
		user.setBirthday(birthday);
		user.setGraduation(graduation);
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println(user.getBirthday());
		System.out.println(user.getGraduation());
		
		try{
			userDAO = UserDAOFactory.getDAOInstance();
		}catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		if(userDAO.doCreate(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
		
		
	}
	
//	@Override
//	public void validate() {
//		
//		if(username==null||username.length()<4||username.length()>6){
//			this.addActionError("username invalid!");
//		}
//		if(password==null||password.length()<4||password.length()>6){
//			this.addActionError("password invalid!");
//		}else if(repassword==null||repassword.length()<4||repassword.length()>6){
//			this.addActionError("repassword invalid!");
//		}else if(!password.equals(repassword)){
//			this.addActionError("password not same!");
//		}
//		
//		if(age<18||age>100){
//			this.addActionError("age invalid!");
//		}
//		if(birthday==null){
//			this.addActionError("birthday invalid!");
//		}
//		
//		if(graduation==null){
//			this.addActionError("graduation invalid!");
//		}
//		
//		if(birthday!=null && graduation!=null){
//			
//			Calendar c1 = Calendar.getInstance();
//			c1.setTime(birthday);
//			
//			Calendar c2 = Calendar.getInstance();
//			c1.setTime(graduation);
//			
//			if(!c1.after(c2)){
//				this.addActionError("time invalid!");
//			}
//			
//		}
//		
//	}
//	
	
}
