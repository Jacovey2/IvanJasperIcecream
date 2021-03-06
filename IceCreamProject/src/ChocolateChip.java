import java.awt.*;
import java.util.Random;

public class ChocolateChip extends Scoop{
	public ChocolateChip(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, new Color(60, 40, 0), g);
		randomChips(xPos, yPos, g);
		g.setColor(Color.black);
		Topping t = new Topping(xPos,yPos,topping,g);
		price+=t.price;
	}
	void randomChips(int x,int y,Graphics g) {
		Random r = new Random();
		int numChunks = r.nextInt(6) + 10;
		for (int i=0; i<numChunks; i++) {
			//Picks whether this is a cookie dough or a chocolate chip
			if (r.nextInt(2)==1)
				g.setColor(new Color(204, 160, 115));
			else
				g.setColor(new Color(46, 26, 0));
			// Picks a polar point, converts it to Cartesian, and shifts it to the center of
			// the scoop
			// angle picking
			double angle = r.nextDouble() * 2 * Math.PI;
			// radius picking
			int radius = r.nextInt(50);
			// converting from (theta, r) to (x, y)
			int cx = x+50 + (int) Math.round(radius * Math.cos(angle));
			int cy = y+50 + (int) Math.round(radius * Math.sin(angle));
			//Make semi-random polygon at (cx,cy)
			Polygon p = new Polygon();
			p.addPoint(cx - 3, cy - 1 - r.nextInt(4));
			p.addPoint(cx + 3, cy - 1 - r.nextInt(4));
			p.addPoint(cx + 3, cy + 1 + r.nextInt(4));
			p.addPoint(cx - 3, cy + 1 + r.nextInt(4));
			g.fillPolygon(p);
		}
	}
}
