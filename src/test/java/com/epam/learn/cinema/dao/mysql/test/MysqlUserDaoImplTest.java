package com.epam.learn.cinema.dao.mysql.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.mysql.MysqlRoleDaoImpl;
import com.epam.learn.cinema.dao.mysql.MysqlUserDaoImpl;
import com.epam.learn.cinema.dao.util.ConnectionCreator;
import com.epam.learn.cinema.entities.Role;
import com.epam.learn.cinema.entities.User;
import static org.junit.Assert.*;

public class MysqlUserDaoImplTest {
	private MysqlUserDaoImpl userDaoImpl = new MysqlUserDaoImpl();
	
    @BeforeClass
    public static void beforeTest() throws SQLException, ClassNotFoundException {
    	ConnectionCreator.setProperty("testing.properties");
    	try (Connection con = ConnectionCreator.createConnection();
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
    	MysqlRoleDaoImpl roledao = new MysqlRoleDaoImpl();
    	try {
			roledao.create(Role.createRole("UserTest"));
	    	roledao.create(Role.createRole("AdminTest"));
		} catch (DaoException e) {
			e.printStackTrace();
		}
    }
	
	@Test
	public void createUserTest() throws DaoException {
		boolean expected = false;
		expected = userDaoImpl.create(User.createUser("Oleg", "Olegovich", "Olol123", "1234pass", 1));
		assertTrue(expected);
	}
	
	@Test
	public void findUserByIdTest() throws DaoException {
		userDaoImpl.create(User.createUser("Oleg", "Olegovich", "Olol123", "1234pass", 1));
		User expectedUser = new User(1, "Oleg", "Olegovich", "Olol123", "1234pass", 1);
		User actual = userDaoImpl.findUserById(1);
		assertEquals(expectedUser.getUserId(), actual.getUserId());
		assertEquals(expectedUser.getFirstname(), actual.getFirstname());
		assertEquals(expectedUser.getLastname(), actual.getLastname());
		assertEquals(expectedUser.getLogin(), actual.getLogin());
		assertEquals(expectedUser.getPassword(), actual.getPassword());
		assertEquals(expectedUser.getRoleId(), actual.getRoleId());
	}
	
	@Test
	public void findUserByLoginTest() throws DaoException {
		User expectedUser = new User(1, "Oleg", "Olegovich", "Olol123", "1234pass", 1);
		userDaoImpl.create(expectedUser);
		User actual = userDaoImpl.findUserByLogin(expectedUser.getLogin());
		assertEquals(expectedUser.getUserId(), actual.getUserId());
		assertEquals(expectedUser.getFirstname(), actual.getFirstname());
		assertEquals(expectedUser.getLastname(), actual.getLastname());
		assertEquals(expectedUser.getLogin(), actual.getLogin());
		assertEquals(expectedUser.getPassword(), actual.getPassword());
		assertEquals(expectedUser.getRoleId(), actual.getRoleId());
	}
	
	@Test
	public void updateUserTest() throws DaoException {
		User user = new User(1, "Oleg", "Olegovich", "Olol123", "1234pass", 1);
		userDaoImpl.create(user);
		assertTrue(userDaoImpl.update(new User(user.getUserId(), "updated", "updated", "updated", "updated", 1)));
	}
}
