package com.epam.learn.cinema.dao;

import java.util.List;
import com.epam.learn.cinema.entities.Role;

public interface RoleDao {
	boolean create(Role role) throws DaoException;
	
	Role findRoleById(int id) throws DaoException;
	List<Role> findAll() throws DaoException;
	Role findRoleByName(String name) throws DaoException;
	
	Role update(Role role) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Role role) throws DaoException;
}
