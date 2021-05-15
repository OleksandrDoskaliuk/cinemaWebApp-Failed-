package com.epam.learn.cinema.entity.test;

import org.junit.Assert;
import org.junit.Test;

import com.epam.learn.cinema.entities.User;

public class UserTest {
	private int id = 1;
	private String firstname = "Ivan";
	private String lastname = "Ivanovich";
	private String login = "ivanIvanovicn";
	private String password = "123";
	private int roleId = 1;
	
	@Test
	public void createUserWithoutParamsTest() {
		
		User user = new User();
		user.setId(id);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setLogin(login);
		user.setPassword(password);
		user.setroleId(roleId);
		
		Assert.assertEquals(id, user.getId());
		Assert.assertEquals(firstname, user.getFirstname());
		Assert.assertEquals(lastname, user.getLastname());
		Assert.assertEquals(login, user.getLogin());
		Assert.assertEquals(password, user.getPassword());
		Assert.assertEquals(roleId, user.getroleId());
	}
	
	@Test
	public void userHashCodeTest() {
		User first = User.createUser(id, firstname, lastname, login, password, roleId);
		User second = User.createUser(id, firstname, lastname, login, password, roleId + 1);
		
		Assert.assertNotEquals(first.hashCode(), second.hashCode());
	}
	
	@Test
	public void userEqualsTest() {
		User first = User.createUser(id, firstname, lastname, login, password, roleId);
		User userWithSameLogin = User.createUser(id + 1, "Andrii", "Lastivka", login, password, roleId + 1);
		User userWithDiffLogin = User.createUser(id + 2, "Andrii", "Lastivka", "newLogin", password, roleId + 2);
		
		Assert.assertEquals(first, first);
		Assert.assertEquals(first, userWithSameLogin);
		Assert.assertNotEquals(first, userWithDiffLogin);
		Assert.assertNotEquals(first, new Object());
	}
	
	@Test
	public void userToStringTest() {
		User user = User.createUser(id, firstname, lastname, login, password, roleId);
		String expected = "User [id=1, firstname=Ivan, lastname=Ivanovich, login=ivanIvanovicn, password=123, roleId=1]";
		String actual = user.toString();
		Assert.assertEquals(expected, actual);
	}
}
