import java.awt.*;
import java.util.Random;

public class Topping {
	public int x;
	public int y;
	public double price;
	public Topping(int xPos, int yPos, String type, Graphics g){
		x=xPos;
		y=yPos;
		if (type.equals("Flake") || type.equals("fl")) {
			makeFlake(g);
			price=0.75;
		}
		if (type.equals("Cherry") || type.equals("ch")) {
			makeCherry(g);
			price=1;
		}
		if (type.equals("Fudge") || type.equals("fu")) {
			makeFudge(g);
			price=1.25;
		}
		if (type.equals("Sprinkles") || type.equals("sp")) {
			makeSprinkles(g);
			price=0.50;
		}
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
