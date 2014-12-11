package com.qiheng.factory;

import com.qiheng.DAO.IUserDAO;
import com.qiheng.DAO.proxy.UserDAOProxy;

public class UserDAOFactory {
	public static IUserDAO getDAOInstance() throws Exception{
		return new UserDAOProxy();
	}
}
