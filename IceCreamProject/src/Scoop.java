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
		if (topping.equals("Flake") || topping.equals("fl"))
			makeFlake(g);
		if (topping.equals("Cherry") || topping.equals("ch"))
			makeCherry(g);
		if (topping.equals("Fudge") || topping.equals("fu"))
			makeFudge(g);
		if (topping.equals("Sprinkles") || topping.equals("sp"))
			makeSprinkles(g);
	}

	public void makeFlake(Graphics g) {
		int[] Xpos = { x + 95, x + 110, x + 80, x + 65 };
		int[] Ypos = { y - 25, y - 25, y + 30, y + 30 };
		g.setColor(new Color(139, 69, 19));
		g.fillPolygon(Xpos, Ypos, 4);
		g.setColor(Color.black);
		g.drawLine(x + 100, y - 25, x + 65, y + 30);
		g.drawLine(x + 105, y - 25, x + 70, y + 30);
		g.drawLine(x + 110, y - 25, x + 75, y + 30);
	}

	public void makeCherry(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x + 25, y - 10, 30, 30);
		g.drawArc(x + 40, y - 50, 20, 100, 90, 100);
	}

	public void makeFudge(Graphics g) {
		g.setColor(new Color(139, 69, 19));
		g.fillOval(x + 17, y, 70, 25);
		g.fillOval(x + 10, y + 10, 25, 40);
		g.fillOval(x + 30, y + 10, 25, 40);
		g.fillOval(x + 50, y + 10, 25, 40);
		g.fillOval(x + 70, y + 10, 25, 40);
		g.setColor(Color.black);
	}

	public void makeSprinkles(Graphics g) {
		Random r = new Random();
		int numSprinkles = r.nextInt(100) + 100;
		int numCompleted = 0;
		while (numCompleted != numSprinkles) {
			g.setColor(RandomColor());
			double angle = r.nextDouble() * 2 * Math.PI;
			int radius = r.nextInt(50);
			int xpos = x + 50 + (int) Math.round(radius * Math.cos(angle));
			int ypos = y + 50 + (int) Math.round(radius * Math.sin(angle));
			g.drawLine(xpos, ypos, xpos + (r.nextInt(11) - 5), ypos + (r.nextInt(11) - 5));
			numCompleted++;
		}
		g.setColor(Color.black);
	}

	private Color RandomColor() {
		Random r = new Random();
		return new Color(r.nextInt(254), r.nextInt(254), r.nextInt(254));
	}
}