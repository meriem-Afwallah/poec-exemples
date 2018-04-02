package hello;

public class StringUtil {

	public int countCharacters(String texte) {
		int counterOfCharacters = 0;
		char[]tableauDeCaractere = new char[texte.length()];
		
		for (int i = 0; i < tableauDeCaractere.length; i++) {
			tableauDeCaractere[i] = texte.charAt(i);
		}
		for (int i = 0; i < tableauDeCaractere.length; i++) {
			if(tableauDeCaractere[i]!=' ') {
				counterOfCharacters += tableauDeCaractere[i];
			}else {
				tableauDeCaractere[i]++;
			}
			
		}
		return counterOfCharacters;
		
		
	}
	public int countWords(String texte) {
		int counterWords = 0;
		char space = ' ';
		int counterSpaceBar = 0;
		
		for(int i = 0; i < texte.length(); i++) {
			if(space ==TRUE) {
				counterSpaceBar ++ ; 
			}
		}
		counterWords = texte.length() - counterSpacebar;
		
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
	
	
}
