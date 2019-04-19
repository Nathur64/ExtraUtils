package me.chickfla.extrautils.commands;

import org.bukkit.entity.Player;

import me.chickfla.extrautils.managers.CommandManager;
import me.chickfla.extrautils.managers.UtilityCommand;

public class CHelp extends UtilityCommand {

	public CHelp() {
		super("extrautils.command.help", "help");
	}

	@Override
	public void onCommand(Player player, String[] args) {
		CommandManager.showHelp(player);
	}
	
}
