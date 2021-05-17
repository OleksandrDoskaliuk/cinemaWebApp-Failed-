package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Ticket;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.TicketDao;

public class MysqlTicketDaoImpl implements TicketDao {

	@Override
	public boolean create(Ticket ticket) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Ticket findTicketById(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public List<Ticket> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public Ticket update(Ticket ticket) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(Ticket ticket) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
