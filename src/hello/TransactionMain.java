package hello;

public class TransactionMain {

	public static void main(String[] args, Object transactions) {
		// une traansaction a deux variables d'instance:
		// - type: String ("debit" ou "cr�dit")
		// - amount: double (toujours positif)
		
		//cr�er 4 transactions:
		//d�bit: 10, cr�dit:20, d�bit: 30, cr�dit:15
		
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
			if(transactions[i].getType().equals("d�bit")){
				total-= transactions[i].amount;
			} else if (transactions[i].type.equals("cr�dit")) {
				total += transactions[i].amount;
			} 
			
			
		}*/
		

	}

}
