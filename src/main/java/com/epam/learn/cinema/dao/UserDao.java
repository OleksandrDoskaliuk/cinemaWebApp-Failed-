package com.epam.learn.cinema.dao;

import java.util.List;

import com.epam.learn.cinema.entities.User;

public interface UserDao {
	boolean create(User user) throws DaoException;
	
	User findUserById(int id) throws DaoException;
	List<User> findAll() throws DaoException;
	User findUserByLogin(String login) throws DaoException;
	
	User update(User user) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(User user) throws DaoException;
}
