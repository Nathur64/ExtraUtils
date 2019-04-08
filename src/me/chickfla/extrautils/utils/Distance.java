package me.chickfla.extrautils.utils;

public class Distance {
	public float DDDdistance(double p1_x, double p1_y, double p1_z, double p2_x, double p2_y, double p2_z) {
		return (float) Math.sqrt( (p2_x-p1_x)*(p2_x-p1_x) + (p2_y-p1_y)*(p2_y-p1_y) + (p2_z-p1_z)*(p2_z-p1_z) );
	}
	public float DDdistance(double p1_x, double p1_z, double p2_x, double p2_z) {
		return (float) Math.sqrt( (p2_x-p1_x)*(p2_x-p1_x) + (p2_z-p1_z)*(p2_z-p1_z) );
	}
}
