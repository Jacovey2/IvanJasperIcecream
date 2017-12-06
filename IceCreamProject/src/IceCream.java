import java.awt.*;
import java.awt.Polygon;
import java.util.List;

public class IceCream {
	public int x;
	public int y;
	private double price;
	public Scoop[] Scoops;

	public IceCream(int xPos, int yPos, String receptical, String[] types, String[] toppings, Graphics g) {
		x = xPos;
		y = yPos;
		Scoops = new Scoop[types.length];
		
		for (int i = 0; i < types.length; i++) {
			if (types[i].equals("Vanilla") || types[i].equals("va"))
				Scoops[i] = new Scoop(x, y - (i + 1) * 80,toppings[i], g);
			if (types[i].equals("ChocolateChip") || types[i].equals("cc"))
				Scoops[i] = new ChocolateChip(x, y - (i + 1) * 80,toppings[i], g);
			if (types[i].equals("Mango") || types[i].equals("ma"))
				Scoops[i] = new Mango(x, y - (i + 1) * 80,toppings[i], g);
			if (types[i].equals("Strawberry") || types[i].equals("st"))
				Scoops[i] = new Strawberry(x, y - (i + 1) * 80,toppings[i], g);
			if (types[i].equals("CookiesNCream") || types[i].equals("cnc"))
				Scoops[i] = new CookiesNCream(x, y - (i + 1) * 80,toppings[i], g);
			if (types[i].equals("RockyRoad") || types[i].equals("rr"))
				Scoops[i] = new RockyRoad(x, y - (i + 1) * 80,toppings[i], g);
			price += Scoops[i].price;
		}
		if (receptical.toLowerCase().equals("cup"))
			drawCup(g);
		if (receptical.toLowerCase().equals("Cone"))
			drawCone(g);
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
		p.addPoint(x + 75, y + 100);
		p.addPoint(x + 25, y + 100);
		g.setColor(new Color(236, 240, 185));
		g.fillPolygon(p);
		g.setColor(Color.black);
	}

	public double getPrice() {
		return price;
	}
}