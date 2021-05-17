package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.constants;

public class RoleQuery {
	private RoleQuery() {}
	
	public static final String ROLE_ID = "role_id";
	public static final String ROLE_NAME = "role_name";
	public static final String INSERT_ROLE = "INSERT INTO roles(`role_name`) VALUES (?)";
}
