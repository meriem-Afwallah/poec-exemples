package hello;

public class TransactionMain {

	public static void main(String[] args, Object transactions) {
		// une traansaction a deux variables d'instance:
		// - type: String ("debit" ou "crédit")
		// - amount: double (toujours positif)
		
		//créer 4 transactions:
		//débit: 10, crédit:20, débit: 30, crédit:15
		
		Transaction t1 = new Transaction("debit", 10);
		//t1.setType("debit");
		//t1.setAmount(10);
		
		Transaction t2 = new Transaction("credit",20);
		//t2.setType("credit");
		//t2.setAmount(20);
		
		Transaction t3 = new Transaction("debit",30);
		//t3.setType("debit");
		//t3.setAmount(30);
		
		Transaction t4 = new Transaction("credit",15);
		//t4.setType("credit");
		//t4.setAmount(15);
		
		
		//exercice: calculer le total des transactions
		/*double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i].getType().equals("débit")){
				total-= transactions[i].amount;
			} else if (transactions[i].type.equals("crédit")) {
				total += transactions[i].amount;
			} 
			
			
		}*/
		

	}

}
