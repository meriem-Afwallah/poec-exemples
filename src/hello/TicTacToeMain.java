package hello;

public class TicTacToeMain {

	public static void main(String[] args) {
		
		//cr�er un jeu de morpion qui peut se jouer � 2 joueurs
		
		//1) cr�er la classe grille suivant ces sp�cifications
		TTTGrid grid = new TTTGrid();
	
		//grid.put(char symbol, int x, int y);
		
		grid.put('x', 1, 2);
		grid.put('0', 0, 0);
		grid.put('x', 0, 1);
		//2) cr�er une m�thode qui permet d'afficher la grille
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
