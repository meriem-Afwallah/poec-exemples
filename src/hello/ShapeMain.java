package hello;

public class ShapeMain {

	public static void main(String[] args) {
		// cr�er une classe Rectangle
		//qui poss�de une m�thode
		//public int calcArea(int width, int height)
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 50;
		System.out.println(r1.calcArea());
		
		Rectangle r2 = new Rectangle();
		r2.width = 20;
		r2.height = 30;
		System.out.println(r2.calcArea());

	}

}
