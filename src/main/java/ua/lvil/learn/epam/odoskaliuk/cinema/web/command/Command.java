package ua.lvil.learn.epam.odoskaliuk.cinema.web.command;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;

public abstract class Command implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public abstract String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, DaoException;
	
	@Override
	public final String toString() {
		return getClass().getSimpleName();
	}
}
