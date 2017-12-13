import java.awt.*;
import java.util.Random;

public class Strawberry extends Scoop {
	public Strawberry(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, new Color(233, 155, 155), g);
		randomStrawberryBits(xPos, yPos, g);
		drawStrawberry(xPos,yPos,g);
		g.setColor(Color.BLACK);
		Topping t = new Topping(xPos,yPos,topping,g);
		price+=t.price;
	}
	private void randomStrawberryBits(int x, int y, Graphics g) {
		Random r = new Random();
		int numChunks = r.nextInt(6) + 4;
		g.setColor(Color.red);
		for (int i = 0; i < numChunks; i++) {
			// Picks a polar point, converts it to Cartesian, and shifts it to the center of
			// the scoop
			// angle picking
			double angle = r.nextDouble() * 2 * Math.PI;
			// radius picking
			int radius = r.nextInt(40);
			// converting from (theta, r) to (x, y)
			int cx = x+50 + (int) Math.round(radius * Math.cos(angle));
			int cy = y+50 + (int) Math.round(radius * Math.sin(angle));
			//Make semi-random polygon at (cx,cy)
			Polygon p = new Polygon();
			p.addPoint(cx - 7, cy - 7 - r.nextInt(4));
			p.addPoint(cx + 7, cy - 7 - r.nextInt(4));
			p.addPoint(cx, cy + 1 + r.nextInt(4));
			g.fillPolygon(p);
		}
	}
	private void drawStrawberry(int xPos, int yPos, Graphics g) {
		Polygon n = new Polygon(); //creates a strawberry on the side of the strawberry scoop
		n.addPoint(xPos, yPos);
		n.addPoint(xPos + 30, yPos + 10);
		n.addPoint(xPos + 2, yPos + 50);
		g.setColor(Color.red);
		g.fillPolygon(n);
		g.setColor(Color.green);
		g.fillArc(xPos - 3, yPos - 15, 20, 30, 330, 110);
		g.fillArc(xPos + 16, yPos - 15, 20, 30, 135, 85);
	}
}
