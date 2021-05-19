package ua.lvil.learn.epam.odoskaliuk.cinema.db.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;

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
		/*if (PROPERTIES == null) {
			try {
				PROPERTIES = new Properties();
				PROPERTIES.load(new FileReader("resources/database.properties"));
				DATABASE_URL = (String) PROPERTIES.getProperty("db.url");
			} catch (IOException e) {
				PROPERTIES = null;
				System.out.println("Loading error");
				System.err.println(e.getMessage());
			}
		} else {
			throw new SQLException("Property already setted!");
		}*/
	}
	
	public static synchronized Connection createConnection() throws SQLException {
		Connection con = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:comp/env/jdbc/cinema");
			System.out.println(envContext);
			// ST4DB - the name of data source
			DataSource ds = (DataSource)envContext.lookup("jdbc/cinema");
			con = ds.getConnection();
		} catch (NamingException ex) {
			System.out.println("Cannot obtain a connection from the pool");			
			ex.printStackTrace();		
		}
		return con;
	}
}
