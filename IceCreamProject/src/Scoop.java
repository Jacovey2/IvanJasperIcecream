import java.awt.*;

public class Scoop{
	protected double price;
	public int x;
	public int y;
	protected Color color;
	protected Graphics graphics;
	//new Color(255, 240, 220))
	
	public Scoop(int xPos, int yPos, String topping, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);

		if (topping.equals("Flake")|| topping.equals("fl"))
			makeFlake(g);
		if (topping.equals("Cherry")|| topping.equals("ch"))
			makeCherry(g);
		if (topping.equals("Fudge")|| topping.equals("fu"))
			makeFudge(g);
		if (topping.equals("Sprinkles") || topping.equals("sp")) 
			makeSprinkles(g);
	}
	
	public void makeFlake (Graphics g) {
		
	}
	public void makeCherry (Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x+25, y-10, 40, 40);
		g.drawArc(x+50,y-50, 20, 100, 90, 100);
	}
	public void makeFudge (Graphics g) {
		g.setColor(new Color(139, 69, 19));
		g.fillOval(x+17, y, 70, 25);
		g.fillOval(x+10, y+10, 25, 40);
		g.fillOval(x+30, y+10, 25, 40);
		g.fillOval(x+50, y+10, 25, 40);
		g.fillOval(x+70, y+10, 25, 40);
		g.setColor(Color.black);
	}
	public void makeSprinkles (Graphics g) {
		
	}
}