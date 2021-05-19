package ua.lvil.learn.epam.odoskaliuk.cinema.web.command;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.bean.ScheduleItem;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.MysqlScheduleSessionDaoImpl;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.MysqlDateFormatter;
import ua.lvil.learn.epam.odoskaliuk.cinema.web.Path;

public class ScheduleСommand extends Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, DaoException {
		System.out.println("ScheduleСommand execute method");
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime beginningOfNextDay = currentDate.plusDays(1).toLocalDate().atStartOfDay();
		System.out.println("Prepare for load schedule from db");
		List<ScheduleItem> scheduleItems = new MysqlScheduleSessionDaoImpl().findScheduleItemsByScope(
				currentDate, beginningOfNextDay);
		System.out.println("Schedule loaded");
		request.setAttribute("scheduleItems", scheduleItems);
		System.out.println("Set request attribute");
		System.out.println("redirecting...");
		return Path.PAGE_SCHEDULE;
	}

}
