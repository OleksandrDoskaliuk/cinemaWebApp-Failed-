package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.SeatCategoryDao;
import com.epam.learn.cinema.entities.SeatCategory;

public class MysqlSeatCategoryDaoImpl implements SeatCategoryDao {

	@Override
	public boolean create(SeatCategory seatCategory) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public SeatCategory findSeatCategoryById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public SeatCategory findSeatCategoryByName(String name) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<SeatCategory> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public SeatCategory update(SeatCategory seatCategory) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(SeatCategory seatCategory) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
