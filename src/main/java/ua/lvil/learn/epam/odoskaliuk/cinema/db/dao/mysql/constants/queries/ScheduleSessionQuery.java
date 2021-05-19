package ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.constants.queries;

public class ScheduleSessionQuery {
	public static final String FIND_SCHEDULE_BY_DATE_SCOPE = "select m.name, m.duration, s.start_time, (select count(*) from tickets where s.session_id = tickets.session_id) as seats_reserved \r\n"
			+ "	from sessions as s inner join movies as m on s.movie_id = m.movie_id and s.start_time > ? and s.start_time < ?;";
	
	public static final String FIND_BY_ID = "select * from sessions where sessions.session_id = ?";
}
