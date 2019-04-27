package me.nathur64.data;
import me.nathur64.sys.Temp;
public class Triple<t0,t1,t2> {
    private int Id= Temp.Len;
    public t0 first;
    public t1 second;
    public t2 third;
    public Triple(){ this.Id = Temp.Len; Temp.Append(this); };
    public Triple(t0 a){ this.first= a; this.Id = Temp.Len; Temp.Append(this); };
    public Triple(t0 a, t1 b){ this.first= a; this.second= b; this.Id = Temp.Len; Temp.Append(this); };
    public Triple(t0 a, t1 b, t2 c){ this.first= a; this.second= b; this.third= c; this.Id = Temp.Len; Temp.Append(this); };
    public Object get(int i){switch(i%3){
        case 0: return this.first;
        case 1: return this.second;
        case 2: return this.third;
        default: return null;
    }};
    public boolean set(int i, Object v){ switch(i%3){
        case 0: this.first= (t0)v; break;
        case 1: this.second= (t1)v; break;
        case 2: this.third= (t2)v; break;
        default: return false;
    }; return true; };
    public String toString(){
        return "<Triple("+this.first+", "+this.second+", "+this.third+")>";
    };
};
