package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Movie;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.MovieDao;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.ConnectionCreator;

public class MysqlMovieDaoImpl implements MovieDao {

	@Override
	public boolean create(Movie movie) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Movie findMovieById(int id) throws DaoException {
		Movie movie = null;
		try (Connection con = ConnectionCreator.createConnection(); 
				Statement st = con.createStatement(); 
				ResultSet rs = st.executeQuery("Select * from movies where movies.movie_id = " + id + ";")) {
			if (rs.next()) {
				movie = new Movie();
				movie.setMovieId(rs.getInt("movie_id"));
				movie.setName(rs.getString("name"));
				movie.setDuration(rs.getInt("duration"));
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return movie;
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
