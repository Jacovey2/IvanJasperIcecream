import java.awt.*;
import java.awt.Polygon;
import java.util.List;

public class IceCream {
	public int x;
	public int y;
	private double price;
	public Scoop[] Scoops;

	public IceCream(int xPos, int yPos, String[] types, Graphics g) {
		x = xPos;
		y = yPos;
		Scoops = new Scoop[types.length];

		for (int i = 0; i < types.length; i++) {
			if (types[i].equals("Vanilla")) 
				Scoops[i] = new Scoop(x, y + i * 100, g);
			if (types[i].equals("ChocolateChip")) 
				Scoops[i] = new ChocolateChip(x, y + i * 100, g);
			if (types[i].equals("Mango")) 
				Scoops[i] = new Mango(x, y - i * 100, g);
			if (types[i].equals("Strawberry")) 
				Scoops[i] = new Strawberry(x, y - i * 100, g);
			if (types[i].equals("CookiesNCream")) 
				Scoops[i] = new CookiesNCream(x, y - i * 100, g);
			if (types[i].equals("RockyRoad")) 
				Scoops[i] = new RockyRoad(x, y - i * 100, g);
			price += Scoops[i].price;
		}
	}
	public void drawCone(Graphics g) {
		Polygon p = new Polygon();
		p.addPoint(x, y);
		p.addPoint(x + 100, y);
		p.addPoint(x + 50, y + 150);
		g.setColor(new Color(90, 50, 0));
		g.fillPolygon(p);
		g.setColor(Color.black);
	}
	public void drawCup(Graphics g) {
		Polygon p = new Polygon();
		p.addPoint(x, y);
		p.addPoint(x + 100, y);
		p.addPoint(x + 50, y + 150);
		g.setColor(new Color(90, 50, 0));
		g.fillPolygon(p);
		g.setColor(Color.black);
	}

	public double getPrice() {
		return price;
	}
}