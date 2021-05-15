package com.epam.learn.cinema.dao;

import java.util.List;

import com.epam.learn.cinema.entities.SeatCategory;

public interface SeatCategoryDao {

	boolean create(SeatCategory seatCategory) throws DaoException;
	
	SeatCategory findSeatCategoryById(int id) throws DaoException;
	SeatCategory findSeatCategoryByName(String name) throws DaoException;
	List<SeatCategory> findAll() throws DaoException;
		
	SeatCategory update(SeatCategory seatCategory) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(SeatCategory seatCategory) throws DaoException;
}
