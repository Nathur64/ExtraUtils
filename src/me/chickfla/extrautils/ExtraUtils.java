package me.chickfla.extrautils;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

import me.chickfla.extrautils.commands.*;
import me.chickfla.extrautils.managers.CommandManager;

public class ExtraUtils extends JavaPlugin {

	Permission cdist = new Permission("extrautils.command.distance");	
	@Override
	public void onEnable() {
		getLogger().info("Hello, World!");
		CommandManager.addCommand("distance", new CDistance());
		CommandManager.addCommand("console", new CConsole());
		CommandManager.addCommand("help", new CHelp());
		
		getCommand("extrautils").setExecutor(new CommandManager());
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
