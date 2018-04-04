package hello;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		
		//créer un jeu de morpion qui peut se jouer à 2 joueurs
		
		//1) créer la classe grille suivant ces spécifications
		TTTGrid grid = new TTTGrid(3);
		Scanner input = new Scanner(System.in);
		
		Player joueur1 = new Player ("toto", 'x');
		Player joueur2 = new Player ("tata", 'O');
		
		Player [] players = {joueur1, joueur2} ;
		
		for (; ;) {	
			for (int i = 0; i < players.length; i++) {
			System.out.println( players[i].getNom() + " position de X et Y ");
			grid.put(players[i].getSymbol(), input.nextInt(), input.nextInt());
			grid.print();
			 }
		}
		grid.thereIsAWinner();
		
		
		//grid.put(char symbol, int x, int y);
		
		//grid.put('x', 1, 2);
		//grid.put('0', 0, 0);
		//grid.put('x', 0, 1);
		//2) créer une méthode qui permet d'afficher la grille
		//grid.print();
		
		//modifier le programme afin
		//1)de demander au joueur x la case  il veut jouer
		// 2) faire le put correspondant
		// 3) afficher la grille
		
		// 4) de demander au joueur O la case il veut jouer
		// 5) faire le put correspondant
		// 6) afficher la grille
		
		
		// 7) boucler afin que les joueurs jouent à tour de rôle
		
		
		//1)
		// Faire apparaitre le concept de joueur
			// Classe Player
					// nom, symbol
		
		//Au debut du programme
			// Initialiser 2 joueurs, en leurr damandant à tour de rôle
			//de choisir 
				
		
				// Au debut du programme
					// 1)Initialiser 2 joueurs, en leur demandant à tour de rôle
					// de choisir un symbole et leur nom
				
				// 2) Comptage des scores
					// le joueur ayant gagné marque 1 point
					// en fin de partie afficher les points des joueurs
				

		
	}

}
