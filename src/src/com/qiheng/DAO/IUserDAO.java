package com.qiheng.DAO;

import com.qiheng.bean.User;

public interface IUserDAO {
	
	public boolean doCreate(User user) throws Exception;
	
	public User findByUsername(String username);

}
