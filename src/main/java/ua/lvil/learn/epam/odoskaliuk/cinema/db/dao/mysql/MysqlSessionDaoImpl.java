package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.Date;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Session;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.SessionDao;

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
