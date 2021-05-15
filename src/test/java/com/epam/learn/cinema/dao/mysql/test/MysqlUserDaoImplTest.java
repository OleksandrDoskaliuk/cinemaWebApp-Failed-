package com.epam.learn.cinema.dao.mysql.test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

public class MysqlUserDaoImplTest {
	private static final Properties PROPERTIES = new Properties();
	
    @BeforeClass
    public static void beforeTest() throws SQLException, ClassNotFoundException {
    	try {
			PROPERTIES.load(new FileReader("testing.properties"));
		} catch (IOException e) {
			System.out.println("Loading error");
			System.err.println(e.getMessage());
		}
    	String databaseUrl = (String) PROPERTIES.get("db.url");
    	try (Connection con = DriverManager.getConnection(databaseUrl, PROPERTIES);
    			Statement statement = con.createStatement()) {
    		statement.addBatch("DROP TABLE IF EXISTS users;");
    		statement.addBatch("DROP TABLE IF EXISTS roles;");
    		
    		String sqlRole = "CREATE TABLE roles (\r\n"
    				+ "  role_id INTEGER(11) NOT NULL AUTO_INCREMENT,\r\n"
    				+ "  role_name VARCHAR(20) NOT NULL,\r\n"
    				+ "  PRIMARY KEY (role_id));";
    		
    		String sqlUser = "CREATE TABLE users (\r\n"
    				+ "  user_id INTEGER(11) NOT NULL AUTO_INCREMENT,\r\n"
    				+ "  firstname VARCHAR(20) NOT NULL,\r\n"
    				+ "  lastname VARCHAR(20) NOT NULL,\r\n"
    				+ "  login VARCHAR(25) NOT NULL,\r\n"
    				+ "  password VARCHAR(24) NOT NULL,\r\n"
    				+ "  role_id INTEGER(11),\r\n"
    				+ "  PRIMARY KEY (user_id),\r\n"
    				+ "  CONSTRAINT users_role_fk\r\n"
    				+ "  FOREIGN KEY (role_id)\r\n"
    				+ "  REFERENCES roles (role_id)\r\n"
    				+ "  ON DELETE CASCADE\r\n"
    				+ "  ON UPDATE CASCADE);";
    		
    		statement.addBatch(sqlRole);
    		statement.addBatch(sqlUser);
    		statement.executeBatch();
    	} catch (SQLException e) {
    		System.out.println("Create table exception");
    		e.printStackTrace();
    	}
    }
	
	@Test
	public void createUserTest() {
		
	}
}
