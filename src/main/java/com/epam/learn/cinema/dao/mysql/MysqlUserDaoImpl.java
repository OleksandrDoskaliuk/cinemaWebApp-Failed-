package com.epam.learn.cinema.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.UserDao;
import com.epam.learn.cinema.dao.mysql.constants.UserQuery;
import com.epam.learn.cinema.dao.util.ConnectionCreator;
import com.epam.learn.cinema.entities.User;

public class MysqlUserDaoImpl implements UserDao{

	@Override
	public boolean create(User user) throws DaoException {
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement ps = connection.prepareStatement(UserQuery.INSERT_USER, Statement.RETURN_GENERATED_KEYS)) {
			int k = 1;
			ps.setString(k++, user.getFirstname());
			ps.setString(k++, user.getLastname());
			ps.setString(k++, user.getLogin());
			ps.setString(k++, user.getPassword());
			ps.setInt(k++, user.getRoleId());
			if (ps.executeUpdate() == 1) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					user.setUserId(rs.getInt(1));
				}
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					throw new DaoException(e);
				}
				return true;
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return false;
	}

	@Override
	public User findUserById(int id) throws DaoException {
		User user = null;
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement ps = connection.prepareStatement(UserQuery.FIND_BY_ID)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = createUserFromResulSet(rs);
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new DaoException(e);
				}
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return user;
	}

	@Override
	public List<User> findAll() throws DaoException {
		List<User> userList = new ArrayList<User>();
		try (Connection con = ConnectionCreator.createConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(UserQuery.FIND_ALL_USERS)) {
			while (rs.next()) {
				User user = createUserFromResulSet(rs);
				userList.add(user);
			}
		} catch (SQLException e) {
			throw new DaoException();
		}
		return userList;
	}

	
	@Override
	public User findUserByLogin(String login) throws DaoException {
		User user = null;
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement ps = connection.prepareStatement(UserQuery.FIND_BY_LOGIN)) {
			ps.setString(1, login);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = createUserFromResulSet(rs);
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new DaoException(e);
				}
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return user;
	}

	@Override
	public boolean update(User user) throws DaoException {
		try (Connection con = ConnectionCreator.createConnection();
				PreparedStatement ps = con.prepareStatement(UserQuery.UPDATE_USER)) {
			int k = 1;
			ps.setString(k++, user.getFirstname());
			ps.setString(k++, user.getLastname());
			ps.setString(k++, user.getLogin());
			ps.setString(k++, user.getPassword());
			ps.setInt(k++, user.getRoleId());
			ps.setInt(k++, user.getUserId());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return false;
	}

	@Override
	public boolean delete(int id) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	private User createUserFromResulSet(ResultSet rs) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt(UserQuery.USER_ID));
		user.setFirstname(rs.getString(UserQuery.FIRSTNAME));
		user.setLastname(rs.getString(UserQuery.LASTNAME));
		user.setLogin(rs.getString(UserQuery.LOGIN));
		user.setPassword(rs.getString(UserQuery.PASSWORD));
		user.setRoleId(rs.getInt(UserQuery.ROLE_ID));
		return user;
	}
}
