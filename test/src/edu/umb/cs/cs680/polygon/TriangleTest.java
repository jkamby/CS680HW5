package edu.umb.cs.cs680.polygon;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

//import edu.umb.cs.cs680.Triangle;

/**
 * @author JohnPaul
 *
 */
public class TriangleTest {

	/**
	 * Test method for {@link edu.umb.cs.cs680.Triangle#Triangle(java.awt.Point, java.awt.Point, java.awt.Point)}.
	 */
	@Test
	public void testTriangle() {
		Point A = new Point(1, 1);
		Point B = new Point(3, 5);
		Point C = new Point(5, 1);
		Triangle target = new Triangle(A, B, C);
		assertNotNull(target);
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Triangle#getPoints()}.
	 */
	@Test
	public void testGetPoints() {
		Point A = new Point(1, 1);
		Point B = new Point(3, 5);
		Point C = new Point(5, 1);
		Triangle target = new Triangle(A, B, C);
		ArrayList<Point> actual = target.getPoints();
		ArrayList<Point> expected = new ArrayList<Point> ();
		expected.add(A);
		expected.add(B);
		expected.add(C);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Triangle#getArea()}.
	 */
	@Test
	public void testGetArea() {
		Point A = new Point(1, 1);
		Point B = new Point(3, 5);
		Point C = new Point(5, 1);
		Triangle target = new Triangle(A, B, C);
		double actual = target.getArea();
		double expected = 8.0;
		assertThat(expected, is(actual));
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Triangle#getCentroid()}.
	 */
	@Test
	public void testGetCentroid() {
		Point A = new Point(1, 1);
		Point B = new Point(3, 5);
		Point C = new Point(5, 1);
		Triangle target = new Triangle(A, B, C);
		Point actual = target.getCentroid();
		assertNull(actual);
	}

}
