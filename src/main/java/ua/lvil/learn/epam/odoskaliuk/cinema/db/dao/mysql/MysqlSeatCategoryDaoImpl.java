package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.SeatCategory;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.SeatCategoryDao;

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
