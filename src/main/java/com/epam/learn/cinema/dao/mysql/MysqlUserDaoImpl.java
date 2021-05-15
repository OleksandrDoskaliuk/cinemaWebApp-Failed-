package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.UserDao;
import com.epam.learn.cinema.entities.User;

public class MysqlUserDaoImpl implements UserDao{

	@Override
	public boolean create(User user) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUserById(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByLogin(String login) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) throws DaoException {
		// TODO Auto-generated method stub
		return null;
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

}
