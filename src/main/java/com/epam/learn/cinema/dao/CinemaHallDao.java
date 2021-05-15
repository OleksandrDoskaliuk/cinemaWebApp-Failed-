package com.epam.learn.cinema.dao;

import java.util.List;

import com.epam.learn.cinema.entities.CinemaHall;

public interface CinemaHallDao {
	boolean create(CinemaHall cinemaHall) throws DaoException;
	
	CinemaHall findCinemaHallById(int id) throws DaoException;
	List<CinemaHall> findAll() throws DaoException;
		
	CinemaHall update(CinemaHall cinemaHall) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(CinemaHall cinemaHall) throws DaoException;
}
