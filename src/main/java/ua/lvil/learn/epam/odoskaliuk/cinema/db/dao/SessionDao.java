package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.Date;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Session;

public interface SessionDao {
	boolean create(Session session) throws DaoException;
	
	Session findSessionById(int id) throws DaoException;
	Session findSessionByStartTime(Date date) throws DaoException;
	List<Session> findAll() throws DaoException;
		
	Session update(Session session) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Session session) throws DaoException;
}
