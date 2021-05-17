package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.CinemaHallDao;
import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.entities.CinemaHall;

public class MysqlCinemaHallDaoImpl implements CinemaHallDao {

	@Override
	public boolean create(CinemaHall cinemaHall) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public CinemaHall findCinemaHallById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<CinemaHall> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public CinemaHall update(CinemaHall cinemaHall) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(CinemaHall cinemaHall) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
