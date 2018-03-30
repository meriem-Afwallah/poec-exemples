package hello;

public class ECommerce {

	public static void main(String[] args) {

		Article ar1 = new Article("voiture", 2000.0);
		//ar1.setTitre("voiture");
		//ar1.setPrix (2000.0);
		//System.out.println(ar1.getPrix());
		//System.out.println(ar1.getTitre());
		//System.out.println(ar1.titre);
		//System.out.println(ar1.prix);
		
		Article ar2 = new Article("moto",1000.0);
		//ar2.setTitre("moto");
		//ar2.setPrix (1000.0);
		//System.out.println(ar2.titre);
		//System.out.println(ar2.prix);
		
		Article ar3 = new Article("velo",200.0);
		//ar3.setTitre("velo");
		//ar3.setPrix(200.0);
		//System.out.println(ar3.titre);
		//System.out.println(ar3.prix);
		

		Commande commande = new Commande();
		//System.out.println(commande.getArticles(new Article[5]));

		//commande.ajouterArticle(ar1);
		//for (int i = 0; i < commande.articles.length; i++) {
		//	System.out.println(commande.getArticle);
			
		//}

	}

}
