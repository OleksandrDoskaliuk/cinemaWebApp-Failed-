package com.epam.learn.cinema.dao.mysql;

import java.util.Date;
import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.SessionDao;
import com.epam.learn.cinema.entities.Session;

public class MysqlSessionDaoImpl implements SessionDao {

	@Override
	public boolean create(Session session) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Session findSessionById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Session findSessionByStartTime(Date date) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<Session> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Session update(Session session) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(Session session) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
