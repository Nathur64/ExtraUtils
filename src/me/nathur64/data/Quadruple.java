package me.nathur64.data;

import org.bukkit.Location;
import me.nathur64.sys.Temp;

public class Quadruple<t0,t1,t2,t3> {
    private int Id= Temp.Len;
    public t0 first;
    public t1 second;
    public t2 third;
    public t3 forth;
    public Quadruple(){ Temp.Append(this); };
    public Quadruple(t0 a){ this.first= a; Temp.Append(this); };
    public Quadruple(t0 a, t1 b){ this.first= a; this.second= b; Temp.Append(this); };
    public Quadruple(t0 a, t1 b, t2 c){ this.first= a; this.second= b; this.third= c; Temp.Append(this); };
    public Quadruple(t0 a, t1 b, t2 c, t3 d){ this.first= a; this.second= b; this.third= c; this.forth= d; Temp.Append(this); };
    public Quadruple(Location Location){
        Quadruple<String, Double,Float,Double> d= null;
        d.first= Location.getWorld().getName();
        d.second= Location.getX();
        d.third= (float)Location.getY();
        d.forth= Location.getZ();
    };
    public Object get(int i){switch(i%4){
        case 0: return this.first;
        case 1: return this.second;
        case 2: return this.third;
        case 3: return this.forth;
        default: return null;
    }};
    public boolean set(int i, Object v){ switch(i){
        case 0: this.first= (t0)v; break;
        case 1: this.second= (t1)v; break;
        case 2: this.third= (t2)v; break;
        case 3: this.forth= (t3)v; break;
        default: return false;
    }; return true; };
    public String toString(){
        return "<Quadruple("+this.first+", "+this.second+", "+this.third+", "+this.forth+")>";
    };
};
