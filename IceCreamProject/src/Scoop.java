import java.awt.*;
import java.util.Random;

public class Scoop {
	protected double price;
	public int x;
	public int y;
	protected Color color;
	protected Graphics graphics;

	public Scoop(int xPos, int yPos, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.fillOval(x, y + 75, 25, 25);
		g.fillOval(x + 20, y + 75, 25, 25);
		g.fillOval(x + 40, y + 75, 25, 25);
		g.fillOval(x + 60, y + 75, 25, 25);
		g.fillOval(x + 75, y + 75, 25, 25);
		g.setColor(Color.black);
	}
	
	public Scoop(int xPos, int yPos, String topping, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.fillOval(x, y + 75, 25, 25);
		g.fillOval(x + 20, y + 75, 25, 25);
		g.fillOval(x + 40, y + 75, 25, 25);
		g.fillOval(x + 60, y + 75, 25, 25);
		g.fillOval(x + 75, y + 75, 25, 25);
		g.setColor(Color.black);
		Topping t = new Topping(x,y,topping,g);
	}
}