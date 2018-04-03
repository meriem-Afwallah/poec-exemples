package hello;

public class TicTacToeMain {

	public static void main(String[] args) {
		
		//créer un jeu de morpion qui peut se jouer à 2 joueurs
		
		//1) créer la classe grille suivant ces spécifications
		TTTGrid grid = new TTTGrid();
	
		//grid.put(char symbol, int x, int y);
		
		grid.put('x', 1, 2);
		grid.put('0', 0, 0);
		grid.put('x', 0, 1);
		//2) créer une méthode qui permet d'afficher la grille
		grid.print();
		/*
-------------
| 0 |   |   |
-------------
| x |   |   |
-------------
|   | x |   | 
		 */
		
		
	}

}
