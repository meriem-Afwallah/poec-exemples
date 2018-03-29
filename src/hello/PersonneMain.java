package hello;


public class PersonneMain {

	public static void main(String[] args) {
		// en dessous : une instruction qui a 
		// créer un objet de type personne
		Personne p1 = new Personne(); 
		System.out.println(p1);
		p1.prenom = "Bob";
		System.out.println(p1.prenom);
		p1.nom = "l'éponge";
		System.out.println(p1.nom);
		System.out.println(p1.age);
		System.out.println(p1.getFullname());
		
		/*Personne p2 = new Personne(); 
		System.out.println(p2);
		System.out.println(p2.prenom);
		System.out.println(p2.nom);
		System.out.println(p2.age);*/

	}

}
