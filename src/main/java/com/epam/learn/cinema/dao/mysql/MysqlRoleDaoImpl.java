package com.epam.learn.cinema.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.RoleDao;
import com.epam.learn.cinema.dao.mysql.constants.RoleQuery;
import com.epam.learn.cinema.dao.util.ConnectionCreator;
import com.epam.learn.cinema.entities.Role;

public class MysqlRoleDaoImpl implements RoleDao{

	@Override
	public boolean create(Role role) throws DaoException {
		try (Connection con = ConnectionCreator.createConnection();
				PreparedStatement ps = con.prepareStatement(RoleQuery.INSERT_ROLE, Statement.RETURN_GENERATED_KEYS)) {
			ps.setString(1, role.getRoleName());
			if (ps.executeUpdate() == 1) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					role.setRoleId(rs.getInt(1));
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
	public Role findRoleById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<Role> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Role findRoleByName(String name) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Role update(Role role) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(Role role) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
