package hello;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringDemo {

	public static void main(String[] args) {
		String s = "bonjour"; //lit�ral syntax
		// String s2 = new String("bonjour");
		System.out.println(s.charAt(1));
		System.out.println(s.concat("le monde"));
		System.out.println(s.isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(1, 4));
		
		String result = "bonjour" + " " + "le" + " " +"monde";
		
		StringBuilder sb = new StringBuilder();
		sb.append("bonjour");
		sb.append(" ");
		sb.append("le");
		sb.append(" ");
		sb.append("monde");
		sb.reverse();
		result = sb.toString();
		System.out.println(result);
		
		int a = 3;
		int b = 4;
		System.out.println(a == b);
		
		String s1 = new String("bonjour");
		String s2 = new String("bonjour");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3 = "bonjour";
		String s4 = "bonjour";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		String who = "toi";
		System.out.println("bonjour " + who);
		System.out.format("bonjour %s %s%n", who, "moi");
		
		double nb = 5.54321;
		System.out.format("nombre: %.2f", nb);
		
		
		
	}

}
