import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Comparator;
import java.util.Random;

public class ColorCircle extends Circle
{
	private Random rand = new Random();
	private final static int rgb = 255;
	private Color color;

	// Constructor
	public ColorCircle(double x, double y, double r)
	{
		// creates a circle object and assigns a random color to color
		super(x, y, r);
		color = new Color(rand.nextInt(rgb), rand.nextInt(rgb), rand.nextInt(
		      rgb));
	}

	/**
	 * move circle to the new coordinates using the super method from circle
	 * 
	 * @param x new coordinate of the centre
	 * @param y new coordinate of the centre
	 */
	public void move(double x, double y)
	{
		super.move(x, y);
	}

	/**
	 * gets the radius of the ColorCircle and creates and ellipse using it
	 * along with the x and y 
	 * sets color to color of ColorCircle
	 * fills and draws the ColorCircle
	 * @param g2
	 */
	public void fill(Graphics2D g2)
	{
		// draw and fill the circle with myColor
		double radius = getRadius();
		Ellipse2D.Double c = new Ellipse2D.Double(super.getX() - radius,
		      super.getY() - radius, 2 * radius, 2 * radius);
		g2.setColor(this.color);
		g2.fill(c);
		g2.draw(c);
	}

//	

}