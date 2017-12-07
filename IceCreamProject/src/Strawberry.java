import java.awt.*;
import java.util.Random;

public class Strawberry extends Scoop{
	public Strawberry(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, topping, new Color(233,155,155), g);
		Random r = new Random();
		int numChuncks = r.nextInt(6)+10;
		int numCompleted=0;
		g.setColor(new Color(156,0,76));
		while (numCompleted<numChuncks) {
			int x = r.nextInt(100)+xPos;
			int y = r.nextInt(100)+yPos;
			if (Math.sqrt(Math.pow(x-(xPos+50), 2)+Math.pow(y-(yPos+50), 2))<50.0 && y<yPos+70) {
				Polygon p= new Polygon();
				p.addPoint(x-3, y-1-r.nextInt(4));
				p.addPoint(x+3, y-1-r.nextInt(4));
				p.addPoint(x+3, y+1+r.nextInt(4));
				p.addPoint(x-3, y+1+r.nextInt(4));
				g.fillPolygon(p);
				numCompleted++;
			}
		}
		g.setColor(Color.BLACK);
	}
}
