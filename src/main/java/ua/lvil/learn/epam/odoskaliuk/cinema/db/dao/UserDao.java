package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.User;

public interface UserDao {
	boolean create(User user) throws DaoException;
	
	User findUserById(int id) throws DaoException;
	List<User> findAll() throws DaoException;
	User findUserByLogin(String login) throws DaoException;
	
	boolean update(User user) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(User user) throws DaoException;
}
