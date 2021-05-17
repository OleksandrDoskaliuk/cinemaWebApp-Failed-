package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.MovieDao;
import com.epam.learn.cinema.entities.Movie;

public class MysqlMovieDaoImpl implements MovieDao {

	@Override
	public boolean create(Movie movie) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Movie findMovieById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<Movie> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Movie findMovieByName(String name) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Movie update(Movie movie) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Movie movie) throws DaoException {
		// TODO Auto-generated method stub
		return false;
	}

}
