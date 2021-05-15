package com.epam.learn.cinema.dao.constants.mysql;

public class UserQuery {
	private UserQuery() {}
	
	public static final String INSERT_USER = "INSERT INTO users(`firstname`, `lastname`, `login`, `password`, `role_id`) VALUES(?, ?, ?, ?, ?);";
}
