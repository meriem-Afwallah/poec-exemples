package hello;

public class Commande {
	
	Article[] articles = new Article[5];
	

	public void ajouterArticle(Article article) {
		
		
			for (int i = 0; i < articles.length; i++) {
				if(articles[i] == null) {
				 
				}else {
					articles[i] = article;
				}
				
				
				
			}
		
		
	
}

}
