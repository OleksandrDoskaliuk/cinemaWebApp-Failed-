package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao;

import java.util.Date;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.ScheduleSession;

public interface ScheduleSessionDao {
	boolean create(ScheduleSession scheduleSession) throws DaoException;
	
	ScheduleSession findSessionById(int id) throws DaoException;
	List<ScheduleSession> findAll() throws DaoException;
		
	ScheduleSession update(ScheduleSession scheduleSession) throws DaoException;
	
	boolean delete(int id) throws DaoException;
	boolean delete(ScheduleSession scheduleSession) throws DaoException;
}
