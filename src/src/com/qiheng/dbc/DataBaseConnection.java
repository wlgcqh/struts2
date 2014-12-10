package com.qiheng.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static final String DBDRIVER = "org.git.mm.mysql.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/qh";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="admin";
	
	private Connection conn;

	public DataBaseConnection() throws Exception {
		try {
			Class.forName(DBDRIVER);
			this.conn = DriverManager.getConnection(URL, DBUSER, DBPASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}
	
	public void close(){
		
		if(this.conn != null){
			try {
				this.conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
