package com.epam.learn.cinema.dao.mysql.constants;

public class UserQuery {
	private UserQuery() {}
	
	public static final String USER_ID = "user_id";
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";
	public static final String LOGIN = "login";
	public static final String PASSWORD = "password";
	public static final String ROLE_ID = "role_id";
	public static final String INSERT_USER = "INSERT INTO users(`firstname`, `lastname`, `login`, `password`, `role_id`) VALUES(?, ?, ?, ?, ?);";
	public static final String FIND_BY_ID = "SELECT * FROM users WHERE user_id = (?);";
	public static final String FIND_ALL_USERS = "SELECT * FROM users;";
	public static final String FIND_BY_LOGIN = "SELECT * FROM users WHERE login = (?);";
	public static final String UPDATE_USER = "UPDATE users SET firstname = ?, lastname = ?, login = ?, password = ?, role_id = ? WHERE user_id = ?;";
	public static final String DELETE_USER_BY_ID = "DELETE FROM users where user_id = ?;";
	public static final String DELETE_USER_BY_PARAMS = "DELETE FROM users where firstname = ? and lastname = ? and login = ?;";
}
