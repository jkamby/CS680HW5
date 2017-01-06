package edu.umb.cs.cs680.polygon;

import java.awt.Point;
import java.util.ArrayList;

public interface Polygon {
	public ArrayList<Point> getPoints();
	public double getArea();
	public Point getCentroid();
	
}
