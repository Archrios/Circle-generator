import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DrawPanel extends JPanel
{
	private ArrayList<ColorCircle> circles;

	/**
	 * default constructor of DrawPanel with circles set to a new ArrayList
	 */
	public DrawPanel()
	{
		circles = new ArrayList<ColorCircle>();
	}

	/**
	 * adds a new ColorCircle with parameters x, y, and r into the array list
	 * repaints 
	 * @param x: x coordinate of the ColorCircle
	 * @param y: y coordinate of the ColorCircle
	 * @param r: radius of the ColorCircle
	 */
	public void addCircle(double x, double y, double r)
	{
		circles.add(new ColorCircle(x, y, r));
	}

	/**
	 * if the size of the arraylist circles is greater than 0, remove the last ColorCircle in the list
	 */
	public void removeCircle()
	{
		if (circles.size() > 0)
		{
			circles.remove(circles.size()-1);
		}
	}

	/**
	 * takes in Graphics g, calls the paintComponent of the JPanel
	 * calls the fill(and draw) method of ColorCircle for each ColorCircle
	 * in the arrayList circles
	 */
	public void paintComponent(Graphics g)
	{
		// Important call super.paintComponent(g) first in this case
		// Be carful not to fall in recursion
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (ColorCircle c : circles) {
			c.fill(g2);
		}
	}

	/**
	 * sets the coordinates of all the ColorCircles in circles
	 * to the center of the DrawPanel
	 */
	public void move()
	{
		for (ColorCircle c : circles) {
			c.move(getWidth()/2, getHeight()/2);
		}
	}
	
	/**
	 * using comparator interface, sort the arraylist from largest to smallest
	 */
	public void sort() {
		class sort implements Comparator<ColorCircle>
		{
			public int compare(ColorCircle c1, ColorCircle c2)
			{
				return (int) (c2.getRadius() - c1.getRadius());
			}
		}
		Collections.sort(circles, new sort());
	}

	/**
	 * set ArrayList circles to a new Array list
	 * effectively clearing it out
	 */
	public void reset()
	{
		circles = new ArrayList<ColorCircle>();
	}
}