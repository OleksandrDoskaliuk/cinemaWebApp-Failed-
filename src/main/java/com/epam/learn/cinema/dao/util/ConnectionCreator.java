package com.epam.learn.cinema.dao.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.epam.learn.cinema.dao.DaoException;

public class ConnectionCreator {
	private static Properties PROPERTIES = null;
	private static String DATABASE_URL;
	
	private ConnectionCreator() {}
	
	public static void setProperty(String path) throws SQLException {
		if (PROPERTIES == null) {
			try {
				PROPERTIES = new Properties();
				PROPERTIES.load(new FileReader(path));
			} catch (IOException e) {
				PROPERTIES = null;
				System.out.println("Loading error");
				System.err.println(e.getMessage());
			}
			DATABASE_URL = (String) PROPERTIES.getProperty("db.url");
		} else {
			throw new SQLException("Property already setted!");
		}
	}
	
	private static void setDefaultProperty() throws SQLException {
		if (PROPERTIES == null) {
			try {
				PROPERTIES = new Properties();
				PROPERTIES.load(new FileReader("database.properties"));
			} catch (IOException e) {
				PROPERTIES = null;
				System.out.println("Loading error");
				System.err.println(e.getMessage());
			}
			DATABASE_URL = (String) PROPERTIES.getProperty("db.url");
		} else {
			throw new SQLException("Property already setted!");
		}
	}
	
	public static Connection createConnection() throws SQLException {
		if (PROPERTIES == null) {
			setDefaultProperty();
		}
		return DriverManager.getConnection(DATABASE_URL, PROPERTIES);
	}
}
