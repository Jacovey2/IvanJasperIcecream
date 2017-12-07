import java.awt.*;
import java.util.Random;

public class CookiesNCream extends Scoop{
	public CookiesNCream(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, topping, new Color(255, 240, 220), g);
		Random r = new Random();
		int numChuncks = r.nextInt(10)+5;
		int numCompleted=0;
		while (numCompleted<numChuncks) {
			int x = r.nextInt(100)+xPos;
			int y = r.nextInt(100)+yPos;
			if (Math.sqrt(Math.pow(x-(xPos+50), 2)+Math.pow(y-(yPos+50), 2))<50.0) {
				Polygon p= new Polygon();
				p.addPoint(x-3, y+r.nextInt(5)-2);
				p.addPoint(x+3, y);
			}
		}
		
		
	}
}
