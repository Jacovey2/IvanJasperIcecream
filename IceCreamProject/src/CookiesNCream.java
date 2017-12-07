import java.awt.*;
import java.util.Random;

public class CookiesNCream extends Scoop{
	public CookiesNCream(int xPos, int yPos, String topping, Graphics g) {
		super(xPos, yPos, topping, new Color(255, 240, 220), g);
		Random r = new Random();
		int numSprinkles = r.nextInt(25)+50;
		
		
	}
}
