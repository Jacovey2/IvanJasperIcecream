import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class GUI extends Applet{
	public double subTotal;
	public int length;
	
	public void init() {
		setSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		Scanner scan= new Scanner(System.in);
		Cone c= new Cone(200,500,0,g);
		
		//Get how many scoops
		length = scan.nextInt();
		for(int i=0; i<length; i++) {
			
		}
	}
	
}