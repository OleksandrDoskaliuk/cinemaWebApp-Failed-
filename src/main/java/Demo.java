import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

import ua.lvil.leanr.epam.odoskaliuk.cinema.db.bean.ScheduleItem;
import ua.lvil.leanr.epam.odoskaliuk.cinema.db.entities.ScheduleSession;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.mysql.MysqlScheduleSessionDaoImpl;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.ConnectionCreator;
import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.MysqlDateFormatter;

public class Demo {
	public static void main(String[] args) {
		
		 List<ScheduleItem> sItems = new ArrayList<ScheduleItem>(); try {
		 MysqlScheduleSessionDaoImpl mssdi = new MysqlScheduleSessionDaoImpl(); sItems
		 = mssdi.findScheduleItemsByScope(MysqlDateFormatter.
		 getLocalDateTimeFromString("2020-05-15 08:00:00"),
		 MysqlDateFormatter.getLocalDateTimeFromString("2020-05-15 22:00:00")); }
		 catch (Exception e) { e.printStackTrace(); } System.out.println(sItems);
		
		
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime begginingOfNextDay = currentDate.plusDays(1).toLocalDate().atStartOfDay();
		System.out.println(currentDate);
		System.out.println(begginingOfNextDay);
	}
}
