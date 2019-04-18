package me.chickfla.extrautils.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.chickfla.extrautils.managers.UtilityCommand;

public class CConsole extends UtilityCommand {

	public CConsole() {
		super("extrautils.command.console", "&cUsage: /console <command>");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		if (!player.hasPermission(getPermission())) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo permission."));
			return true;
		}
		if (args.length < 1) {
			player.sendMessage(getFormattedUsage());
			return true;
		}
		String command = "";
		for (int i = 0; i < args.length; i++) {
			command += args[i] + " ";
		}
		
		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), command);
		
		for (Player player1 : Bukkit.getOnlinePlayers()) {
			if (player1.hasPermission("extrautils.notifications.console") || player1 == player) {
				player1.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2"+player.getName()+" has disbatched the command: &6"+command+"&2as console."));
			}
		}
		
		return true; 
	}
}
