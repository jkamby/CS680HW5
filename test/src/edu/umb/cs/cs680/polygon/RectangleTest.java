/**
 * 
 */
package edu.umb.cs.cs680.polygon;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

//import edu.umb.cs.cs680.polygon.Rectangle;

/**
 * @author JohnPaul
 *
 */
public class RectangleTest {

	/**
	 * Test method for {@link edu.umb.cs.cs680.Rectangle#Rectangle(java.awt.Point, java.awt.Point, java.awt.Point, java.awt.Point)}.
	 */
	@Test
	public void testRectangleInstantiation() {
		Point A = new Point(1, 1);
		Point B = new Point(1, 3);
		Point C = new Point(5, 3);
		Point D = new Point(5, 1);
		Rectangle target = new Rectangle(A, B, C, D);
		assertNotNull(target);
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Rectangle#getPoints()}.
	 */
	@Test
	public void testGetPoints() {
		Point A = new Point(1, 1);
		Point B = new Point(1, 3);
		Point C = new Point(5, 3);
		Point D = new Point(5, 1);
		Rectangle target = new Rectangle(A, B, C, D);
		ArrayList<Point> actual = target.getPoints();
		ArrayList<Point> expected = new ArrayList<Point> ();
		expected.add(A);
		expected.add(B);
		expected.add(C);
		expected.add(D);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Rectangle#getArea()}.
	 */
	@Test
	public void testGetArea() {
		Point A = new Point(1, 1);
		Point B = new Point(1, 3);
		Point C = new Point(5, 3);
		Point D = new Point(5, 1);
		Rectangle target = new Rectangle(A, B, C, D);
		double actual = target.getArea();
		double expected = 8.0;
		assertThat(expected, is(actual));
	}

	/**
	 * Test method for {@link edu.umb.cs.cs680.Rectangle#getCentroid()}.
	 */
	@Test
	public void testGetCentroid() {
		Point A = new Point(1, 1);
		Point B = new Point(1, 3);
		Point C = new Point(5, 3);
		Point D = new Point(5, 1);
		Rectangle target = new Rectangle(A, B, C, D);
		Point actual = target.getCentroid();
		assertNull(actual);
	}

}
