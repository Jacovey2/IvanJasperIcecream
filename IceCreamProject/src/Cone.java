import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Cone {
	public int x;
	public int y;
	
	public Cone(int xPos, int yPos, int Length, Graphics g) {
		x=xPos;
		y=yPos;
		Polygon p= new Polygon();
		p.addPoint(xPos, yPos);
		p.addPoint(xPos+100, yPos);
		p.addPoint(xPos+50, yPos+150);
		g.drawPolygon(p);
	}
}