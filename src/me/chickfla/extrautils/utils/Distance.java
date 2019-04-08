package me.chickfla.extrautils.utils;

public class Distance {
	public float DDDdistance(double p1_x, double p1_y, double p1_z, double p2_x, double p2_y, double p2_z) {
		return (float) Math.sqrt( (p2_x-p1_x)*(p2_x-p1_x) + (p2_y-p1_y)*(p2_y-p1_y) + (p2_z-p1_z)*(p2_z-p1_z) );
	}
	public float DDdistance(double p1_x, double p1_z, double p2_x, double p2_z) {
		return (float) Math.sqrt( (p2_x-p1_x)*(p2_x-p1_x) + (p2_z-p1_z)*(p2_z-p1_z) );
	}
	public float GetDistance(Player p1, Player p2){
		//Use:   me.chickfla.extrautils.utils:Distance.GetDistance({Player 1}, {Player 2}) ==> {Distance between players}.  
		float p1X= p1.getLocation().getX();
		float p1Y= p1.getLocation().getY();
		float p1Z= p1.getLocation().getZ();
		float p2X= p2.getLocation().getX();
		float p2Y= p2.getLocation().getY();
		float p2Z= p2.getLocation().getZ();
		return this.DDDdistance(p1X, p1Y, p1Z, p2X, p2Y, p2Z);
	};
}
