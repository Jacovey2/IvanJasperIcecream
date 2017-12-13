import java.awt.*;

public class IceCream {
	public int x;
	public int y;
	private double price;
	public Scoop[] Scoops;

	public IceCream(int xPos, int yPos, String receptacle, String[] types, String[] toppings, Graphics g) {
		x = xPos;
		y = yPos;
		Scoops = new Scoop[types.length];

		for (int i = 0; i < types.length; i++) {
			boolean failed=false;
			int scoopX=x;
			int scoopY=y - (i + 1) * 80;
			if (types[i].equals("Vanilla") || types[i].equals("va"))
				Scoops[i] = new Scoop(        scoopX, scoopY, toppings[i], new Color(255, 240, 220), g);
			else if (types[i].equals("ChocolateChip") || types[i].equals("cc"))
				Scoops[i] = new ChocolateChip(scoopX, scoopY, toppings[i], g);
			else if (types[i].equals("Mango") || types[i].equals("ma"))
				Scoops[i] = new Mango(        scoopX, scoopY, toppings[i], g);
			else if (types[i].equals("Strawberry") || types[i].equals("st"))
				Scoops[i] = new Strawberry(   scoopX, scoopY, toppings[i], g);
			else if (types[i].equals("CookiesNCream") || types[i].equals("cnc"))
				Scoops[i] = new CookiesNCream(scoopX, scoopY, toppings[i], g);
			else if (types[i].equals("RockyRoad") || types[i].equals("rr"))
				Scoops[i] = new RockyRoad(    scoopX, scoopY, toppings[i], g);
			else failed=true;
			if (!failed)
				price += Scoops[i].price;
		}
		if (receptacle.toLowerCase().equals("cone"))
			drawCone(g);
		if (receptacle.toLowerCase().equals("cup"))
			drawCup(g);
	}

	private void drawCone(Graphics g) {
		g.setColor(Color.cyan);//creates part of holder for cone
		g.fillRect(x+45, y+150, 10, 40 );
		Polygon p = new Polygon();//create physical cone
		p.addPoint(x, y+15);
		p.addPoint(x + 100, y+15);
		p.addPoint(x + 50, y + 165);
		g.setColor(new Color(90, 50, 0));
		g.fillPolygon(p);
		g.setColor(Color.cyan); //creates rest of holder for cone
		g.fillArc(x+5, y+180, 100, 20, 20, 160);
		g.fillRect(x+15, y+75, 23, 7 );
		g.fillRect(x+62, y+75, 23, 7 );
		g.setColor(Color.black);
	}

	private void drawCup(Graphics g) {
		Polygon p = new Polygon();//draws cup
		p.addPoint(x, y+15);
		p.addPoint(x + 100, y+15);
		p.addPoint(x + 75, y + 115);
		p.addPoint(x + 25, y + 115);
		g.setColor(new Color(236, 240, 185));
		g.fillPolygon(p);
		g.setColor(Color.cyan);//creates the holder for the cup
		g.fillArc(x+5, y+165, 100, 20, 20, 160);
		g.fillRect(x+45, y+115, 10, 60 );
		g.fillRect(x+15, y+75, 23, 7 );
		g.fillRect(x+62, y+75, 23, 7 );
		g.setColor(Color.black);
	}

	public double getPrice() {
		return price;
	}
}