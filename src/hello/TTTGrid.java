package hello;

public class TTTGrid {

	private char[][] tabTTT; 
	
	public TTTGrid(){
		tabTTT= new char[3][3];	
	}
	
	public void put(char symbol, int x, int y) {
	
		tabTTT[x][y] = symbol ;		
			
	}

	public void print() {
		
		for (int i = 0; i < tabTTT.length; i++) {
			for (int j = 0; j < tabTTT.length; j++) {
				System.out.println(tabTTT[i][j]);
				
			}
				System.out.println("-----------");
				System.out.println("|" + tabTTT[0][0] + " |  |  |");
				System.out.println("-----------");
				System.out.println("| x |  |  |");
				System.out.println("-----------");
				System.out.println("|  | x |  |");
				System.out.println("-----------");
				
				
				
				
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

}
