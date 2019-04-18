package me.chickfla.extrautils.managers;

import java.util.HashMap;
import java.util.Set;

import me.chickfla.extrautils.ExtraUtils;
import me.chickfla.extrautils.managers.UtilityCommand;

public class CommandManager {

	public ExtraUtils plugin;
	public HashMap<String, UtilityCommand> commands = new HashMap<String, UtilityCommand>();
	
	public CommandManager(ExtraUtils plugin) {
		this.plugin = plugin;
	}
	
	public void addCommand(String command, UtilityCommand commandStruct) {
		commands.put(command,commandStruct);
	}
	
	public void loadCommands() {
		for (String command : commands.keySet()) {
			plugin.getCommand(command).setExecutor(commands.get(command));
		}
	
	}
	
	public Set<String> getCommandsString() {
		return commands.keySet();
	}
	
}
