package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Role;

public interface RoleDao {
	boolean create(Role role) throws DaoException;
	
	Role findRoleById(int id) throws DaoException;
	List<Role> findAll() throws DaoException;
	Role findRoleByName(String name) throws DaoException;
	
	Role update(Role role) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Role role) throws DaoException;
}
