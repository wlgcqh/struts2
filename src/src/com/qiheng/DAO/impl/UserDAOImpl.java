package com.qiheng.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

		this.pstmt.setString(1, user.getUsername());
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

	public User findByUsername(String username) throws Exception {
		User user = null;
		String sql = "SELECT username,password,age,birthday,graduation FROM user WHERE username=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, username);
		ResultSet rs = this.pstmt.executeQuery();
		if(rs.next()){
			user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setAge(rs.getInt(3));
			user.setBirthday(rs.getDate(4));
			user.setGraduation(rs.getDate(5));
		}
		
		this.pstmt.close();
		
		return user;

	}

	public boolean isCorrect(String username, String password) throws Exception {
		boolean flag=false;
		String sql = "SELECT password FROM user WHERE username=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, username);
		ResultSet rs = this.pstmt.executeQuery();
	
		while(rs.next()){
			System.out.println(rs.getString(1));
			if(password.equals(rs.getString(1))){
			
			flag=true;}
		}
		return flag;
	}

}
