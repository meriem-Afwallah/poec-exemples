package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nombreADeviner = 8;
		int i;
		//V1
		//écrire un programme qui demande
		//à l'utilisateur à deviner un nombre
		//entre 1 et 10.
		//tant que l'utilisateur n'a pas deviné le bon 
		//nombre, écrire"perdu" puis
		//redemander à deviner.
		
		//quand l'utilisateur a deviné le bon nombre, 
		//écrire "gagné" et quitter
		//V1.1
		//écrire "gagné en x coups"
		
		
		
		//V1.0
		/* int compteur = 0; 
		for(i = 1; i<=10; i++) {
			i= sc.nextInt();
			compteur++; // thomas
		if(i != nombreADeviner) {
			System.out.println("perdu");
		} else {
			System.out.println("gagné en " + compteur + " coup(s)");
		}*/

		int nombreADeviner = 8;
		Scanner sc = new Scanner(System.in);
		
		int compteur = 0;
		for (;;) {
			
			int choixUtilisateur = sc.nextInt();
			compteur++;
			
			if (nombreADeviner == choixUtilisateur) {
				System.out.println("Gagné en " + compteur + " coups");
				break;
			} else {
				System.out.println("Perdu");
			}
		}	
	}
		
		
		
		
		

	}

}
