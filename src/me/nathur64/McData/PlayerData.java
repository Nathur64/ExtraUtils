package me.nathur64.McData;
//Note:   Importing a java-package wrapper rather than java-directly.  Using the <me.nathur64.JavaImports> package instead of the standard-library would make people feel better when they are looking a the plugin code, because then they only have to worry about what is being done in the <me.nathur64.JavaImports> package.  For this reason, I'll be routing the plugin's imports through the <me.nathur64.JavaImports> package.  This may be a good practice for us, because if Oracle decides to change parts of their standard library, the errors would be in <me.nathur64.JavaImports> and not throughout our entire plugin, because we can't trust that the java-standard library won't have modules replaced over time.
import me.nathur64.JavaImports.Java_uID;
//Note:   These are bukkit only class imports.
import org.bukkit.Location;
import org.bukkit.entity.Player;
//Note:   This is the class.
public class PlayerData {
    String Player1_Name;
    Double Player1_cX;
    Double Player1_cY;
    Double Player1_cZ;
    Double Player1_dtX;
    Double Player1_dtY;
    Double Player1_dtZ;
    Java_uID UID;
    String World;
    PlayerData(PlayerData Pre, Player p1, Player p2, Player p3){
        this.Player1_Name= p1.getName();
        Location p1c= p1.getLocation();
        this.Player1_cX= p1c.getX();
        this.Player1_cY= p1c.getY();
        this.Player1_cZ= p1c.getZ();
        this.Player1_dtX= this.Player1_cX - Pre.Player1_cX;
        this.Player1_dtY= this.Player1_cY - Pre.Player1_cY;
        this.Player1_dtZ= this.Player1_cZ - Pre.Player1_cZ;
        this.World= p1.getWorld().getName();
        this.UID= new Java_uID(p1);
    };
};
