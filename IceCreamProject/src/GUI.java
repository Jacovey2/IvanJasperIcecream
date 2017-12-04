import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class GUI extends Applet{
	public double subTotal;
	public int length;
	public String[] types;
	public String[] toppings;
	public String receptical;
	
	public void init() {
		Scanner scan= new Scanner(System.in);
		setSize(new Dimension(1000,900));
		
		//taking in values to make ice cream
		System.out.println("Cup or Cone?");
		receptical = scan.next();
		
		System.out.println("How many scoops?");
		length = scan.nextInt();
		
		types= new String[length];
		toppings = new String[length];
		for (int i=0; i<length; i++) {
			System.out.println("What flavor?");
			types[i] = scan.next();
			
			System.out.println("What Topping?");
			toppings[i] = scan.next();
		}
	}
	
	public void paint(Graphics g) {
		IceCream c= new IceCream(200,500,receptical,types, toppings,g);
		
	}
	
}