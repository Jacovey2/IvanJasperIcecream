import java.awt.*;
import java.util.Random;

public class RockyRoad extends Scoop {
	public RockyRoad(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, new Color(60, 40, 0), g);
		Random r = new Random();
		int numChunks = r.nextInt(6) + 10;
		for (int i=0; i<numChunks; i++) {
			//Picks whether this is a marshmallow or a chocolate chip
			if (r.nextInt(2)==1)
				g.setColor(new Color(102, 52, 0));
			else
				g.setColor(new Color(255, 255, 255));
			// Picks a polar point, converts it to Cartesian, and shifts it to the center of
			// the scoop
			// angle picking
			double angle = r.nextDouble() * 2 * Math.PI;
			// radius picking
			int radius = r.nextInt(50);
			// converting from (theta, r) to (x, y)
			int x = xPos + 50 + (int) Math.round(radius * Math.cos(angle));
			int y = yPos + 50 + (int) Math.round(radius * Math.sin(angle));
			//Make semi-random polygon at (x,y)
			Polygon p = new Polygon();
			p.addPoint(x - 3, y - 1 - r.nextInt(4));
			p.addPoint(x + 3, y - 1 - r.nextInt(4));
			p.addPoint(x + 3, y + 1 + r.nextInt(4));
			p.addPoint(x - 3, y + 1 + r.nextInt(4));
			g.fillPolygon(p);
		}
		g.setColor(Color.black);
		Topping t = new Topping(xPos,yPos,topping,g);
	}
}
