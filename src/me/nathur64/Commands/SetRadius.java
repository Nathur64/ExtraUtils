package me.nathur64.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SetRadius implements CommandExecutor {
    @Override public boolean onCommand(CommandSender User, Command Cmd, String Label, String[] ArgS){
        int Radius0= User.getServer().getSpawnRadius();
        User.getServer().setSpawnRadius(Integer.parseInt(ArgS[0]));
        Bukkit.getLogger().info(ChatColor.AQUA+"Changing world radius from "+Radius0+" to "+ArgS[0]+".  ");
        return true;
    };
};
