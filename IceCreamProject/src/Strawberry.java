import java.awt.*;
import java.util.Random;

public class Strawberry extends Scoop{
	public Strawberry(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, topping, new Color(233,155,155), g);
		Random r = new Random();
		int numChuncks = r.nextInt(6)+4;
		int numCompleted=0;
		g.setColor(new Color(156,0,76));
		while (numCompleted<numChuncks) {
			int x = r.nextInt(100)+xPos;
			int y = r.nextInt(100)+yPos;
			if (Math.sqrt(Math.pow(x-(xPos+50), 2)+Math.pow(y-(yPos+50), 2))<45.0 && y<yPos+70) {
				Polygon p= new Polygon();
				p.addPoint(x-7, y-7-r.nextInt(4));
				p.addPoint(x+7, y-7-r.nextInt(4));
				p.addPoint(x, y+1+r.nextInt(4));
				g.fillPolygon(p);
				numCompleted++;
			}
		}
		Polygon n = new Polygon();
		n.addPoint(xPos, yPos);
		n.addPoint(xPos+30, yPos+10);
		n.addPoint(xPos+2, yPos+50);
		g.setColor(Color.red);
		g.fillPolygon(n);
		g.setColor(Color.green);
		g.fillArc(xPos-3, yPos-15, 20, 30, 330, 110);
		g.fillArc(xPos+16, yPos-15, 20, 30, 135, 85);
		g.setColor(Color.BLACK);
	}
}
