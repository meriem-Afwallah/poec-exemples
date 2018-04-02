package hello;

public class StrinUtilMain {

	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		
		String texte = "bonjour le monde";
		
		//compte le nombre de caractère autres que espace 
		stringUtil.countCharacters(texte);//14
		
		//compte le nombre de mots ( les mots sont séparés par des espaces
		stringUtil.countWords(texte);
		
		//retourne true si palindrome, false sinon
		stringUtil.isPalindrome(texte);
		stringUtil.ispalindrome("radar");
		
		//retourne true si anagramme, false sinon
		stringUtil.isanagramme("romain", "manoir"); // true
		// v2 avec des phrases séparées par des espace
		stringUtil.isAnagramme("Pablo Picasso", "Pascal Obispo"); // true
		//
		*/
	}

}
