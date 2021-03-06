package com.qiheng.struts2;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private String username;
	
	private String password;
	
	private String repassword;
	
	private int age;
	
	private Date birthday;
	
	private Date graduation;

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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
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
		
		
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		
		if(username==null||username.length()<4||username.length()>6){
			this.addActionError("username invalid!");
		}
		if(password==null||password.length()<4||password.length()>6){
			this.addActionError("password invalid!");
		}else if(repassword==null||repassword.length()<4||repassword.length()>6){
			this.addActionError("repassword invalid!");
		}else if(!password.equals(repassword)){
			this.addActionError("password not same!");
		}
		
		if(age<18||age>100){
			this.addActionError("age invalid!");
		}
		if(birthday==null){
			this.addActionError("birthday invalid!");
		}
		
		if(graduation==null){
			this.addActionError("graduation invalid!");
		}
		
		if(birthday!=null && graduation!=null){
			
			Calendar c1 = Calendar.getInstance();
			c1.setTime(birthday);
			
			Calendar c2 = Calendar.getInstance();
			c1.setTime(graduation);
			
			if(!c1.after(c2)){
				this.addActionError("time invalid!");
			}
			
		}
		
	}
	
	
}
