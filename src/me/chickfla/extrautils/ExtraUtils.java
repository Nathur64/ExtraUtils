package me.chickfla.extrautils;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

import me.chickfla.extrautils.commands.*;
import me.chickfla.extrautils.managers.CommandManager;

public class ExtraUtils extends JavaPlugin {

	Permission cdist = new Permission("extrautils.command.distance");
	CommandManager manager = new CommandManager(this);
	
	@Override
	public void onEnable() {
		getLogger().info("Hello, World!");
		manager.addCommand("distance", new CDistance());
		manager.addCommand("console", new CConsole());
		manager.loadCommands();
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
