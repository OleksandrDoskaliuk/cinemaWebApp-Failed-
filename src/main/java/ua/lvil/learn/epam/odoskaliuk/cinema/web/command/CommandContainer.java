package ua.lvil.learn.epam.odoskaliuk.cinema.web.command;

import java.util.Map;
import java.util.TreeMap;

public class CommandContainer {
	
	private static Map<String, Command> commands = new TreeMap<String, Command>();
	
	static {
		/*
		commands.put("login", new LoginCommand());
		commands.put("logout", new LogoutCommand());
		commands.put("noCommand", new NoCommand());
		commands.put("viewSettings", new ViewSettingsCommand());
		commands.put("updateSettings", new UpdateSettingsCommand());
		
		// client commands
		commands.put("listMenu", new ListMenuCommand());
		
		// admin commands
		commands.put("listOrders", new ListOrdersCommand());
		*/
	}

	public static Command get(String commandName) {
		if (commandName == null || !commands.containsKey(commandName)) {
			return commands.get("noCommand"); 
		}
		return commands.get(commandName);
	}
}
