package hello;

public class StringUtil {

	public int countCharacters(String texte) {
		int counter = 0;
		char[]tableauDeCaractere = new char[texte.length()];
		
		for (int i = 0; i < tableauDeCaractere.length; i++) {
			tableauDeCaractere[i] = texte.charAt(i);
		}
		for (int i = 0; i < tableauDeCaractere.length; i++) {
			if(tableauDeCaractere[i]!=' ') {
				counter = tableauDeCaractere[i];
			}else {
				tableauDeCaractere[i]++;
			}
			
		}
		return counter;
		
		
	}

}
