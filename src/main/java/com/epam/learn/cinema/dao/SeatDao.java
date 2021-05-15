package com.epam.learn.cinema.dao;

import java.util.List;

import com.epam.learn.cinema.entities.Seat;

public interface SeatDao {
	boolean create(Seat seat) throws DaoException;
	
	Seat findSeatById(int id) throws DaoException;
	List<Seat> findAll() throws DaoException;
		
	Seat update(Seat seat) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Seat seat) throws DaoException;
}
