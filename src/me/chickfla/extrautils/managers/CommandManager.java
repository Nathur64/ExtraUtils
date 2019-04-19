package me.chickfla.extrautils.managers;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.chickfla.extrautils.ExtraUtils;
import me.chickfla.extrautils.managers.UtilityCommand;

public class CommandManager implements CommandExecutor {

	public static ExtraUtils plugin;
	public static HashMap<String, UtilityCommand> commands = new HashMap<String, UtilityCommand>();
	
	public static void addCommand(String command, UtilityCommand commandStruct) {
		commands.put(command,commandStruct);
	}

	public static Set<String> getCommandsAsString() {
		return commands.keySet();
	}

	public static void showHelp(Player sender) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2------&6ExtraUtils Help&2------"));
		for (String command : getCommandsAsString()) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c"+command+" &2- &c")+commands.get(command).getFormattedUsage());
		}
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2------&6ExtraUtils Help&2------"));
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		if (args.length < 1) {
			showHelp(player);
			return true;
		}
		if (commands.containsKey(args[0])) {
			String[] arguments = new String[args.length-1];
			for (int i = 1; i < args.length; i++) {
				arguments[i-1] = args[i];
			}
			if (player.hasPermission(commands.get(args[0]).getPermission())) {
				commands.get(args[0]).onCommand(player, arguments);
			}
		} else {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUnknown subcommand: "+args[0]));
		}
		return true;
	}
	
}
