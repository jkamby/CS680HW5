package edu.umb.cs.cs680.polygon;

import java.awt.Point;
import java.util.ArrayList;

public class Rectangle implements Polygon {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle (Point A, Point B, Point C, Point D) {
		this.a = A;
		this.b = B;
		this.c = C;
		this.d = D;
	}

	@Override
	public ArrayList<Point> getPoints() {
		ArrayList<Point> p = new ArrayList<Point> ();
		p.add(this.a);
		p.add(this.b);
		p.add(this.c);
		p.add(this.d);
		return p;
	}

	@Override
	public double getArea() {
		//not checking if the corners were labeled in order!
		double dX = this.a.getX() - this.b.getX();
		double dY = this.a.getY() - this.b.getY();
		
		double x = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		dX = this.b.getX() - this.c.getX();
		dY = this.b.getY() - this.c.getY();
		
		double y = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		double areaRect = x*y;
		
		return areaRect;
	}

	@Override
	public Point getCentroid() {
		System.out.println("getCentroid in Rectangle not (yet) implemented.");
		return null;
	}

}
