package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nombreADeviner = 8;
		int i;
		//V1
		//�crire un programme qui demande
		//� l'utilisateur � deviner un nombre
		//entre 1 et 10.
		//tant que l'utilisateur n'a pas devin� le bon 
		//nombre, �crire"perdu" puis
		//redemander � deviner.
		
		//quand l'utilisateur a devin� le bon nombre, 
		//�crire "gagn�" et quitter
		//V1.1
		//�crire "gagn� en x coups"
		
		
		
		//V1.0
		/* int compteur = 0; 
		for(i = 1; i<=10; i++) {
			i= sc.nextInt();
			compteur++; // thomas
		if(i != nombreADeviner) {
			System.out.println("perdu");
		} else {
			System.out.println("gagn� en " + compteur + " coup(s)");
		}*/

		int nombreADeviner = 8;
		Scanner sc = new Scanner(System.in);
		
		int compteur = 0;
		for (;;) {
			
			int choixUtilisateur = sc.nextInt();
			compteur++;
			
			if (nombreADeviner == choixUtilisateur) {
				System.out.println("Gagn� en " + compteur + " coups");
				break;
			} else {
				System.out.println("Perdu");
			}
		}	
	}
		
		
		
		
		

	}

}
