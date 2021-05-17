package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Seat;

public interface SeatDao {
	boolean create(Seat seat) throws DaoException;
	
	Seat findSeatById(int id) throws DaoException;
	List<Seat> findAll() throws DaoException;
		
	Seat update(Seat seat) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Seat seat) throws DaoException;
}
