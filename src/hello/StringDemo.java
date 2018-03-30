package hello;

public class StringDemo {

	public static void main(String[] args) {
		String s = "bonjour"; //litéral syntax
		// String s2 = new String("bonjour");
		System.out.println(s.charAt(1));
		System.out.println(s.concat("le monde"));
		System.out.println(s.isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(1, 4));
	}

}
