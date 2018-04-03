package hello;

public class StringUtil {

	public int countCharacters(String texte) {
		int counterOfCharacters = 0;
		char[]tableauDeCaractere = new char[texte.length()];
		
		for (int i = 0; i < tableauDeCaractere.length; i++) {
			if(tableauDeCaractere[i]!=' ') {
				counterOfCharacters ++;
			}
			
		}
		return counterOfCharacters;
			
	}
	public int countWords(String texte) {
		int counterWords = 0;
		int counterSpaceBar = 0;
		String []tableauDeMots = new String[texte.length()];

		for(int i = 0; i < texte.length(); i++) {
			if(texte.charAt(i) == ' ') {
				counterSpaceBar ++ ; 
			}
		}
		counterWords = texte.length() - counterSpaceBar;
		
		return counterWords;
	}
		
	
	boolean isPalindrome(String texte) {
		  int n = texte.length();
		  for (int i = 0; i < (n/2); i++) {
		     if (texte.charAt(i) != texte.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	
	boolean isanagramme(String texte1, String texte2) {
		
		
		
		return true;
		
		
		
	}
	
	
}
