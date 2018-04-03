package hello;

import java.math.BigDecimal;

public class TransactionMain {

	public static void main(String[] args, Object transactions) {
		// une traansaction a deux variables d'instance:
		// - type: String ("debit" ou "cr�dit")
		// - amount: double (toujours positif)
		
		//cr�er 4 transactions:
		//d�bit: 10, cr�dit:20, d�bit: 30, cr�dit:15
		
		Transaction t1 = new Transaction("debit", new BigDecimal(10));
		
		
		Transaction t2 = new Transaction("credit", new BigDecimal(20));
		
		Transaction t3 = new Transaction("debit", new BigDecimal(30));
	
		
		Transaction t4 = new Transaction("credit", new BigDecimal(15));

		
		Transaction[] transaction = new Transaction[4];
		transaction[0] = t1;
		transaction[1] = t2;
		transaction[2] = t3;
		transaction[3] = t4;
		
		//exercice: calculer le total des transactions
		BigDecimal total = new BigDecimal(0);
		for (int i = 0; i < transaction.length; i++) {
			if(transaction[i].getType().equals("d�bit")){
				total = total.subtract(transaction[i].getAmount());
			} else if (transaction[i].getType().equals("cr�dit")) {
				total = total.add(transaction[i].getAmount());
			} else {
				System.out.println("type de transaction inconnu - g�rer l'erreur plus proprement");
			}
				
		}
		
		System.out.println("Total des transactions: " + total);
	}

}
