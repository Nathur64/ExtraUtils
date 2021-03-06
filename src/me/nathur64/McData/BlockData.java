package me.nathur64.McData;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
/*
* Provide a block's data under one single class, as a means to make it easier for spigot-developer beginners.
*/;
public class BlockData {
    Block       Block;
    Material    Block_CurrentMaterial;
    Location    Block_Location;
    Material    Block_PreviousMaterial;
    BlockState  Block_State;    //Note:   This is not usually available.
    Integer     Block_X;
    Integer     Block_Y;
    Integer     Block_Z;
    Event       Event;
    String      Event_Name;
    HandlerList Handler;
    //Note:    The following are not always available.  
    Player      Player;
    Location    Player_Location;
    String      Player_Name;
    Integer     Previous_Event;
    Double      Player_X;
    Double      Player_Y;
    Double      Player_Z;
    private void __Auto(Block b, Event e, HandlerList h, Player p, BlockState s){
        this.Block= b;
        this.Event= e;
        this.Handler= h;
        this.Player= p;
        this.Block_CurrentMaterial= this.Block.getType();
        this.Block_Location= this.Block.getLocation();
        this.Block_PreviousMaterial= this.Block_CurrentMaterial;
        this.Block_X= (int) this.Block_Location.getX();
        this.Block_Y= (int) this.Block_Location.getY();
        this.Block_Z= (int) this.Block_Location.getZ();
        this.Event_Name= e.getEventName();
        this.Player_Location= this.Player.getLocation();
        this.Player_Name= this.Player.getName();
        this.Player_X= this.Player_Location.getX();
        this.Player_Y= this.Player_Location.getY();
        this.Player_Z= this.Player_Location.getZ();
        this.Block_State=    s;
    };
    BlockData(Block b, BlockEvent e, HandlerList h, Player p, BlockState s){ this.__Auto(b,e,h,p,s); };
    BlockData(BlockBreakEvent e){    this.__Auto(e.getBlock(), e, e.getHandlers(), e.getPlayer(), null); };
    BlockData(BlockPlaceEvent e){    this.__Auto(e.getBlock(), e, e.getHandlers(), e.getPlayer(), null); };
    BlockData(BlockDamageEvent e){   this.__Auto(e.getBlock(), e, e.getHandlers(), e.getPlayer(), null); };
    BlockData(BlockBurnEvent e){     this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockCanBuildEvent e){ this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockDispenseEvent e){ this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockEvent e){         this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockExpEvent e){      this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockExplodeEvent e){  this.__Auto(e.getBlock(), e, e.getHandlers(), null, null); };
    BlockData(BlockFadeEvent e){     this.__Auto(e.getBlock(), e, e.getHandlers(), null, e.getNewState()); };
    BlockData(BlockFormEvent e){     this.__Auto(e.getBlock(), e, e.getHandlers(), null, e.getNewState()); };
};
