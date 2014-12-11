package com.qiheng.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/qh";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="admin";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);
			 Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
