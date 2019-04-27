package me.nathur64.data;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import me.nathur64.sys.Temp;

public class Single<t0> {
    private int Id; private void setId(int Id){ this.Id= Id; };
    private t0 only;
    Single(){ Temp.Append(this); };
    Single(t0 a){ this.only= a; Temp.Append(this); };
    public t0 getFirst(){ return this.only; };
    public World getWorld(){
        if(this.only.equals((Long)this.only)){ return Bukkit.getWorlds().get((Integer)this.only); };
        if(this.only.equals((String)this.only)){ return Bukkit.getWorld((String)this.only); };
        return Bukkit.getWorlds().get((Integer)this.only);
    };
    public Block getRawBlock(Player Player){ return Player.getWorld().getBlockAt(Player.getLocation()); };
};
