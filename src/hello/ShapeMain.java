package hello;

public class ShapeMain {

	public static void main(String[] args) {
		// créer une classe Rectangle
		//qui possède une méthode
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
