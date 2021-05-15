package com.epam.learn.cinema.dao;

import java.util.Date;
import java.util.List;

import com.epam.learn.cinema.entities.Session;

public interface SessionDao {
	boolean create(Session session) throws DaoException;
	
	Session findSessionById(int id) throws DaoException;
	Session findSessionByStartTime(Date date) throws DaoException;
	List<Session> findAll() throws DaoException;
		
	Session update(Session session) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Session session) throws DaoException;
}
