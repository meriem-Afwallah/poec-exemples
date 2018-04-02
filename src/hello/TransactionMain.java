package hello;

public class TransactionMain {

	public static void main(String[] args, Object transactions) {
		// une traansaction a deux variables d'instance:
		// - type: String ("debit" ou "cr�dit")
		// - amount: double (toujours positif)
		
		//cr�er 4 transactions:
		//d�bit: 10, cr�dit:20, d�bit: 30, cr�dit:15
		
		Transaction t1 = new Transaction("debit", 10);
		
		
		Transaction t2 = new Transaction("credit",20);
		
		Transaction t3 = new Transaction("debit",30);
	
		
		Transaction t4 = new Transaction("credit",15);

		
		Transaction[] transactions = new Transaction[4];
		transactions[0] = t1;
		transactions[1] = t2;
		transactions[2] = t3;
		transactions[3] = t4;
		
		//exercice: calculer le total des transactions
		double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i].getType().equals("d�bit")){
				total-= transactions[i].getAmount;
			} else if (transactions[i].type.equals("cr�dit")) {
				total += transactions[i].getAmount;
			} else {
				System.out.println("type de transaction inconnu - g�rer l'erreur plus proprement");
			}
				
		}
		
		System.out.println("Total des transactions: " + total);
	}

}
