package me.chickfla.extrautils.managers;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UtilityCommand {

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
		return ChatColor.translateAlternateColorCodes('&', "&cUsage: /extrautils "+usage);
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getPermission() {
		return permission;
	}

	public void onCommand(Player player, String[] args) { };
	
}
