import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			double angle = r.nextDouble() * 2 * Math.PI;
			int radius = r.nextInt(50);
			int xpos = (int) Math.round(radius * Math.cos(angle));
			int ypos = (int) Math.round(radius * Math.sin(angle));
			System.out.println("(" + xpos + "," + ypos + ")");
		}
	}

}
