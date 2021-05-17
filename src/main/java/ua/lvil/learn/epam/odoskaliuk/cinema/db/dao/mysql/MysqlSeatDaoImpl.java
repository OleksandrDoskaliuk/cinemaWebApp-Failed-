package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Seat;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.SeatDao;

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
