package hello;

public class ECommerce {

	public static void main(String[] args) {

		Article ar1 = new Article();
		ar1.titre = "voiture";
		ar1.prix = 2000.0;
		//System.out.println(ar1.titre);
		//System.out.println(ar1.prix);
		
		Article ar2 = new Article();
		ar2.titre = "moto";
		ar2.prix = 1000.0;
		//System.out.println(ar2.titre);
		//System.out.println(ar2.prix);
		
		Article ar3 = new Article();
		ar3.titre = "velo";
		ar3.prix = 200.0;
		//System.out.println(ar3.titre);
		//System.out.println(ar3.prix);
		

		Commande commande = new Commande();

		commande.ajouterArticle(ar1);
		for (int i = 0; i < commande.articles.length; i++) {
			System.out.println(commande.articles[i].titre);
			System.out.println(commande.articles[i].prix);
			
		}

	}

}
