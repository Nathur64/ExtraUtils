package me.nathur64.Events;

import me.nathur64.data.Triple;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class Block {
    Triple Coords;
    Block(Triple Coords){
        this.Coords= Coords;
    };
    @EventHandler public void onBlockBreak(BlockBreakEvent bbe){
        Triple oP= Triple<Player, Location, Event> ();
        oP.first= bbe.getPlayer();
    };
};
