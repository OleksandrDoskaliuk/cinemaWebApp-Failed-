package ua.lvil.learn.epam.odoskaliuk.cinema.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.learn.epam.odoskaliuk.cinema.db.dao.DaoException;
import ua.lvil.learn.epam.odoskaliuk.cinema.web.command.Command;
import ua.lvil.learn.epam.odoskaliuk.cinema.web.command.CommandContainer;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String commandName = request.getParameter("command");
		Command command = CommandContainer.get(commandName);
		
		String forward = null;
		
		try {
			forward = command.execute(request, response);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
		if (forward != null) {
			RequestDispatcher view = request.getRequestDispatcher(forward);
			view.forward(request, response);
		}
	}
}
