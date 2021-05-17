package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.SeatDao;
import com.epam.learn.cinema.entities.Seat;

public class MysqlSeatDaoImpl implements SeatDao {

	@Override
	public boolean create(Seat seat) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Seat findSeatById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<Seat> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Seat update(Seat seat) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(Seat seat) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
