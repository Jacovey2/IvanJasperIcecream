import java.awt.*;
import java.util.Random;

public class Mango extends Scoop {
	public Mango(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, new Color(233, 186, 0), g);
		Random r = new Random();
		int numChunks = r.nextInt(5) + 5;
		g.setColor(new Color(255, 124, 92));
		for (int i=0; i<numChunks; i++) {
			// Picks a polar point, converts it to Cartesian, and shifts it to the center of
			// the scoop
			// angle picking
			double angle = r.nextDouble() * 2 * Math.PI;
			// radius picking
			int radius = r.nextInt(40);
			// converting from (theta, r) to (x, y)
			int x = xPos + 50 + (int) Math.round(radius * Math.cos(angle));
			int y = yPos + 50 + (int) Math.round(radius * Math.sin(angle));
			//Make a circle at (x,y)
			int cRadius= r.nextInt(5)+10;
			g.fillOval(x-cRadius, y-cRadius, cRadius, cRadius);
		}
		g.setColor(Color.black);
		Topping t = new Topping(xPos,yPos,topping,g);
	}
}
