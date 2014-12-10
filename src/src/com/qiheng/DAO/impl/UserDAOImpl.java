package com.qiheng.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qiheng.DAO.IUserDAO;
import com.qiheng.bean.User;

public class UserDAOImpl implements IUserDAO {

	private Connection conn = null;

	private PreparedStatement pstmt = null;

	public UserDAOImpl(Connection conn) {

		this.conn = conn;
	}

	public boolean doCreate(User user) throws Exception {

		boolean flag = false;

		String sql = "INSERT INTO user(username,password,age,birthday,graduation) VALUES (?,?,?,?,?)";

		this.pstmt = this.conn.prepareStatement(sql);

		this.pstmt.setString(1, user.getPassword());
		this.pstmt.setString(2, user.getPassword());
		this.pstmt.setInt(3, user.getAge());
		this.pstmt.setDate(4, new java.sql.Date(user.getBirthday().getTime()));
		this.pstmt.setDate(5, new java.sql.Date(user.getGraduation().getTime()));
		
		if(this.pstmt.executeUpdate()>0){
			flag=true;
		}
		
		this.pstmt.close();
		
		return flag;
	}

	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
