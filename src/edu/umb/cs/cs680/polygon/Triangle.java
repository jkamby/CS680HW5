package edu.umb.cs.cs680.polygon;

import java.awt.Point;
import java.util.ArrayList;

public class Triangle implements Polygon {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point A, Point B, Point C) {
		this.a = A;
		this.b = B;
		this.c = C;
	}
	
	@Override
	public ArrayList<Point> getPoints() {
		ArrayList<Point> p = new ArrayList<Point> ();
		p.add(this.a);
		p.add(this.b);
		p.add(this.c);
		return p;
	}
	
	@Override
	public double getArea() {
		double dX = this.a.getX() - this.b.getX();
		double dY = this.a.getY() - this.b.getY();
		
		double x = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		dX = this.b.getX() - this.c.getX();
		dY = this.b.getY() - this.c.getY();
		
		double y = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		dX = this.c.getX() - this.a.getX();
		dY = this.c.getY() - this.a.getY();
		
		double z = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		
		double s = (x+y+z)/2;
		
		double areaTri = Math.sqrt((s*(s-x)*(s-y)*(s-z)));
		
		return areaTri;
	}

	@Override
	public Point getCentroid() {
		System.out.println("getCentroid in Triangle not (yet) implemented.");
		return null;
	}

}
