package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.Ticket;

public interface TicketDao {
	boolean create(Ticket ticket) throws DaoException;
	
	Ticket findTicketById(int id) throws DaoException;
	List<Ticket> findAll() throws DaoException;
	
	Ticket update(Ticket ticket) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(Ticket ticket) throws DaoException;
}
