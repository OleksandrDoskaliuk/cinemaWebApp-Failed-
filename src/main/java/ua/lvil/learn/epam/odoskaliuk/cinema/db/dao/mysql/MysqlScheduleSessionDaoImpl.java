package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.bean.ScheduleItem;
import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.ScheduleSession;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.ScheduleSessionDao;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.constants.queries.ScheduleSessionQuery;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.ConnectionCreator;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.MysqlDateFormatter;

public class MysqlScheduleSessionDaoImpl implements ScheduleSessionDao {

	public List<ScheduleItem> findScheduleItemsByScope(LocalDateTime fromDate, LocalDateTime toDate) throws DaoException {
		List<ScheduleItem> scheduleItems = new ArrayList<ScheduleItem>();
		try (Connection con = ConnectionCreator.createConnection(); 
				PreparedStatement ps = con.prepareStatement(ScheduleSessionQuery.FIND_SCHEDULE_BY_DATE_SCOPE)) {
			ps.setString(1, MysqlDateFormatter.getStringFromLocalDateTime(fromDate));
			ps.setString(2, MysqlDateFormatter.getStringFromLocalDateTime(toDate));
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				try {
					while (rs.next()) {
						int k = 1;
						ScheduleItem sItem = new ScheduleItem();
						sItem.setMovieName(rs.getString(k++));
						sItem.setMovieDuration(rs.getInt(k++));
						sItem.setStartTime(MysqlDateFormatter.getLocalDateTimeFromString(rs.getString(k++)));
						sItem.setReservedSeats(rs.getInt(k++));
						scheduleItems.add(sItem);
					}
					rs.close();
				} catch (SQLException e) {
					throw e;
				}
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return scheduleItems;
	}

	@Override
	public boolean create(ScheduleSession scheduleSession) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public ScheduleSession findSessionById(int id) throws DaoException {
		ScheduleSession session = null;
		try (Connection con = ConnectionCreator.createConnection(); 
				PreparedStatement ps = con.prepareStatement(ScheduleSessionQuery.FIND_BY_ID)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			try {
				if (rs.next()) {
					int k = 1;
					session = new ScheduleSession();
					session.setSessionId(rs.getInt(k++));
					session.setMovieId(rs.getInt(k++));
					session.setCinemaHallId(rs.getInt(k++));
					session.setStartTime(MysqlDateFormatter.getLocalDateTimeFromString(rs.getString(k++)));
				}
				if (rs != null) {
					rs.close();
				} 
			} catch (SQLException e) {
				throw e;
				}
			} catch (SQLException e) {
				throw new DaoException(e);
				}
		return session;
	}


	@Override
	public List<ScheduleSession> findAll() throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public ScheduleSession update(ScheduleSession scheduleSession) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(int id) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

	@Override
	public boolean delete(ScheduleSession scheduleSession) throws DaoException {
		throw new DaoException("Unsuported operation");
	}

}
