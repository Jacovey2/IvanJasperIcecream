import java.awt.*;

public class Scoop {
	protected double price;
	public int x;
	public int y;
	protected Color color;
	protected Graphics graphics;

	public Scoop(int xPos, int yPos, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		graphics = g;
		g.setColor(new Color(255, 240, 220));
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);
	}

	public Scoop(int xPos, int yPos, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);
	}
}
