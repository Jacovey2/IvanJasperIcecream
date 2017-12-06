import java.awt.*;

public class Scoop{
	protected double price;
	public int x;
	public int y;
	protected Color color;
	protected Graphics graphics;

	public Scoop(int xPos, int yPos, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = new Color(255, 240, 220);
		graphics = g;
		g.setColor(new Color(255, 240, 220));
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);
	}

	public Scoop(int xPos, int yPos, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);
	}
	public Scoop(int xPos, int yPos, String topping, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		graphics = g;
		g.setColor(new Color(255, 240, 220));
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);

		if (topping.equals("Flake")|| topping.equals("fl")) {
			//make flake
		}
		if (topping.equals("Cherry")|| topping.equals("ch")) {//makes a cherry on a scoop
			g.setColor(Color.red);
			g.fillOval(x+35, y-20, 30, 30);
			g.drawArc(x+30,y-83, 25, 70, 300, 60);
			g.setColor(Color.black);
		}
		if (topping.equals("Fudge")|| topping.equals("fu")) {
			//make fudge
			g.setColor(new Color(139, 69, 19));
			g.fillOval(x+15, y, 75, 25);
			g.fillOval(x+10, y+10, 25, 40);
			//g.fillOval(x+20, y+10, 25, 40);
			g.fillOval(x+30, y+10, 25, 40);
			//g.fillOval(x+40, y+10, 25, 40);
			g.fillOval(x+50, y+10, 25, 40);
			//g.fillOval(x+60, y+10, 25, 40);
			g.fillOval(x+70, y+10, 25, 40);
			g.setColor(Color.black);
		}
		if (topping.equals("Sprinkles") || topping.equals("sp")) {

		}
	}
	
	public Scoop(int xPos, int yPos, String topping, Color C, Graphics g) {
		price = 1.0;
		x = xPos;
		y = yPos;
		color = C;
		graphics = g;
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.black);

		if (topping.equals("Flake")|| topping.equals("fl")) {
			//make flake
		}
		if (topping.equals("Cherry")|| topping.equals("ch")) {
			g.setColor(Color.red);
			g.fillOval(x, y, 10, 10);
			g.drawArc(x+5,y+10, 5, 10, 300, 60);
		}
		if (topping.equals("Fudge")|| topping.equals("fu")) {
			//make fudge
		}
		if (topping.equals("Sprinkles") || topping.equals("sp")) {
			//make fudge
		}
	}
}
