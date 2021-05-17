package com.epam.learn.cinema.dao.mysql;

import java.util.List;

import com.epam.learn.cinema.dao.DaoException;
import com.epam.learn.cinema.dao.TicketDao;
import com.epam.learn.cinema.entities.Ticket;

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
