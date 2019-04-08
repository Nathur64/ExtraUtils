package me.chickfla.extrautils;

import org.bukkit.plugin.java.JavaPlugin;

import me.chickfla.extrautils.commands.CDistance;

public class ExtraUtils extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Hello, World!");
		getCommand("distance").setExecutor(new CDistance());
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
