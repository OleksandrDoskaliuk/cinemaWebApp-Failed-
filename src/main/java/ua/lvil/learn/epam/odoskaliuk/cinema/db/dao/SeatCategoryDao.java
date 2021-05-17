package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.SeatCategory;

public interface SeatCategoryDao {

	boolean create(SeatCategory seatCategory) throws DaoException;
	
	SeatCategory findSeatCategoryById(int id) throws DaoException;
	SeatCategory findSeatCategoryByName(String name) throws DaoException;
	List<SeatCategory> findAll() throws DaoException;
		
	SeatCategory update(SeatCategory seatCategory) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(SeatCategory seatCategory) throws DaoException;
}
