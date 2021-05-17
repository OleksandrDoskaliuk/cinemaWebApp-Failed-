package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Movie;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.MovieDao;

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
