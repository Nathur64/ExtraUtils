package me.chickfla.extrautils.managers;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UtilityCommand implements CommandExecutor {

	public String permission;
	public String usage;
	
	public UtilityCommand(String permission, String usage) {
		this.permission = permission;
		this.usage = usage;
	}

	public String getUsage() {
		return usage;
	}
	
	public String getFormattedUsage() {
		return ChatColor.translateAlternateColorCodes('&', usage);
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getPermission() {
		return permission;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { return false; }
	
}
