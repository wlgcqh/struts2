package com.qiheng.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.bean.User;

public class UserAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(this.toString());
		System.out.println(this.user.getUsername());
		System.out.println(this.user.getAge());
		
		
		return SUCCESS;
	}

}
