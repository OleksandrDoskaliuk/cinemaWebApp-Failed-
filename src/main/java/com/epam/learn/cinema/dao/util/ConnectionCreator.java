package com.epam.learn.cinema.dao.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
	private static final Properties PROPERTIES = new Properties();
	private static final String DATABASE_URL;
	static {
		try {
			PROPERTIES.load(new FileReader("database.properties"));
		} catch (IOException e) {
			System.out.println("Loading error");
			System.err.println(e.getMessage());
		}
		DATABASE_URL = (String) PROPERTIES.getProperty("db.url");
	}
	
	private ConnectionCreator() {}
	
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL, PROPERTIES);
	}
}
