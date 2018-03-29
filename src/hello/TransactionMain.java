package hello;

public class TransactionMain {

	public static void main(String[] args) {
		// une traansaction a deux variables d'instance:
		// - type: String ("debit" ou "crédit")
		// - amount: double (toujours positif)
		
		//créer 4 transactions:
		//débit: 10, crédit:20, débit: 30, crédit:15
		
		Transaction t1 = new Transaction();
		t1.type = "débit";
		t1.amount = 10;
		
		Transaction t2 = new Transaction();
		t2.type = "crédit";
		t1.amount = 20;
		
		Transaction t3 = new Transaction();
		t1.type = "débit";
		t1.amount = 30;
		
		Transaction t4 = new Transaction();
		t2.type = "crédit";
		t1.amount = 15;
		
		Transaction [] transactions = new Transaction[4];
		transactions[0] = t1;
		transactions[1] = t2;
		transactions[2] = t3;
		transactions[3] = t4;
		
		//exercice: calculer le total des transactions
		double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i].type.equals("débit")){
				total-= transactions[i].amount;
			} else if (transactions[i].type.equals("crédit")) {
				total += transactions[i].amount;
			} 
			
			total += transactions[i];
			
		}
		

	}

}
