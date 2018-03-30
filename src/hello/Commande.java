package hello;

public class Commande {
	
	private Article[] articles;
	

	public void getArticles(Article[] articles) {
		return; 
		
	}
	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
	

	public void ajouterArticle(Article article) {
		
		
			for (int i = 0; i < articles.length; i++) {
				if(articles[i] == null) {
				articles[i]=article; 
				return;
				}
			}
			
}


}
