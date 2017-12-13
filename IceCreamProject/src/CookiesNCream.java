import java.awt.*;
import java.util.Random;

public class CookiesNCream extends Scoop{
	public CookiesNCream(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, topping, new Color(255, 240, 220), g);
		randomCChips(xPos, yPos, g);
		g.setColor(Color.BLACK);
		Topping t = new Topping(xPos,yPos,topping,g);
		price+=t.price;
	}
	private void randomCChips(int x, int y, Graphics g){
		Random r = new Random();
		g.setColor(new Color(102,52,0));
		int numChunks = r.nextInt(6)+10;
		for (int i=0; i<numChunks; i++) {
			//Picks a polar point, converts it to Cartesian, and shifts it to the center of the scoop
			//angle picking
			double angle = r.nextDouble() * 2 * Math.PI;
			//radius picking
			int radius = r.nextInt(50);
			//converting from (theta, r) to (x, y)
			x += 50 + (int) Math.round(radius * Math.cos(angle));
			y += 50 + (int) Math.round(radius * Math.sin(angle));
			//Making a semi-random polygon at (x,y)
			Polygon p= new Polygon();
			p.addPoint(x-3, y-1-r.nextInt(4));
			p.addPoint(x+3, y-1-r.nextInt(4));
			p.addPoint(x+3, y+1+r.nextInt(4));
			p.addPoint(x-3, y+1+r.nextInt(4));
			g.fillPolygon(p);
		}
	}
}
