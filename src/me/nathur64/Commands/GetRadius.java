package me.nathur64.Commands;

import me.chickfla.extrautils.utils.Distance;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetRadius implements CommandExecutor {
    @Override public boolean onCommand(CommandSender User, Command Cmd, String Label, String[] ArgV){
        int sr= User.getServer().getSpawnRadius();
        User.sendMessage("Spawn radius is "+sr+".  ");
        return true;
    };
};
