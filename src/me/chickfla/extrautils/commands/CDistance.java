package me.chickfla.extrautils.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.chickfla.extrautils.managers.UtilityCommand;
import me.chickfla.extrautils.utils.Distance;

public class CDistance extends UtilityCommand {

	public CDistance() {
		super("extrautils.command.distance","&cUsage: &b/distance &7<player1> <player2>");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		
		if (!player.hasPermission(getPermission())) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cInvalid Permission."));
			return true;
		}
		
		if (args.length >= 2) {
			String p1 = args[0];
			String p2 = args[1];
			Player player1;
			Player player2;
			try {
				player1 = Bukkit.getPlayer(p1);
				player2 = Bukkit.getPlayer(p2);
			} catch (Exception e) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cCould not find one or more players."));
				return true;
			}
			
			float distance = new Distance().DDDdistance(player1.getLocation().getX(), player1.getLocation().getY(), player1.getLocation().getZ(), player2.getLocation().getX(), player2.getLocation().getY(), player2.getLocation().getZ());
			
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDistance: &b"+distance+" &cblocks."));
		} else {
			player.sendMessage(getFormattedUsage());
		}
		
		return true;
	}

}
