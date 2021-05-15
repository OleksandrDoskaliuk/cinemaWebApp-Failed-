package com.epam.learn.cinema.entity.test;

import org.junit.Assert;
import org.junit.Test;

import com.epam.learn.cinema.entities.User;

public class UserTest {
	private int userId = 1;
	private String firstname = "Ivan";
	private String lastname = "Ivanovich";
	private String login = "ivanIvanovicn";
	private String password = "123";
	private int roleId = 1;
	
	@Test
	public void createUserWithoutParamsTest() {
		
		User user = new User();
		user.setUserId(userId);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setLogin(login);
		user.setPassword(password);
		user.setRoleId(roleId);
		
		Assert.assertEquals(userId, user.getUserId());
		Assert.assertEquals(firstname, user.getFirstname());
		Assert.assertEquals(lastname, user.getLastname());
		Assert.assertEquals(login, user.getLogin());
		Assert.assertEquals(password, user.getPassword());
		Assert.assertEquals(roleId, user.getRoleId());
	}
	
	@Test
	public void userHashCodeTest() {
		User first = User.createUser(userId, firstname, lastname, login, password, roleId);
		User second = User.createUser(userId, firstname, lastname, login, password, roleId + 1);
		
		Assert.assertNotEquals(first.hashCode(), second.hashCode());
	}
	
	@Test
	public void userEqualsTest() {
		User first = User.createUser(userId, firstname, lastname, login, password, roleId);
		User userWithSameLogin = User.createUser(userId + 1, "Andrii", "Lastivka", login, password, roleId + 1);
		User userWithDiffLogin = User.createUser(userId + 2, "Andrii", "Lastivka", "newLogin", password, roleId + 2);
		
		Assert.assertEquals(first, first);
		Assert.assertEquals(first, userWithSameLogin);
		Assert.assertNotEquals(first, userWithDiffLogin);
		Assert.assertNotEquals(first, new Object());
	}
	
	@Test
	public void userToStringTest() {
		User user = User.createUser(userId, firstname, lastname, login, password, roleId);
		String expected = "User [userId=1, firstname=Ivan, lastname=Ivanovich, login=ivanIvanovicn, password=123, roleId=1]";
		String actual = user.toString();
		Assert.assertEquals(expected, actual);
	}
}
