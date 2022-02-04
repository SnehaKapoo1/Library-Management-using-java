package com.lc.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBConnection {
	public static Connection connection;
	
	private DBConnection() {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("MyNewMySQL123");
		ds.setUrl("jdbc:mysql://localhost:3306/trainingdb");
		try {
			connection = ds.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			if(connection == null || connection.isClosed()) {
				new DBConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
