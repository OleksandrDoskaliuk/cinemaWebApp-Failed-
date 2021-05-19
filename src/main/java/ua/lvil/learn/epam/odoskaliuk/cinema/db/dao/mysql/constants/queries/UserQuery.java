package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.constants.queries;

public class UserQuery {
	public static final String INSERT_USER = "INSERT INTO users(`firstname`, `lastname`, `login`, `password`, `role_id`) VALUES(?, ?, ?, ?, ?);";
	public static final String FIND_BY_ID = "SELECT * FROM users WHERE user_id = (?);";
	public static final String FIND_ALL_USERS = "SELECT * FROM users;";
	public static final String FIND_BY_LOGIN = "SELECT * FROM users WHERE login = (?);";
	public static final String UPDATE_USER = "UPDATE users SET firstname = ?, lastname = ?, login = ?, password = ?, role_id = ? WHERE user_id = ?;";
	public static final String DELETE_USER_BY_ID = "DELETE FROM users where user_id = ?;";
	public static final String DELETE_USER_BY_PARAMS = "DELETE FROM users where firstname = ? and lastname = ? and login = ?;";
}
