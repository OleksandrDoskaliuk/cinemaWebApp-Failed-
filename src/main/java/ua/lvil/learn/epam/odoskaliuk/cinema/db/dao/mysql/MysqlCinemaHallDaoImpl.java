package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.CinemaHall;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.CinemaHallDao;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;

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
