package bankactivities;

public class TestTranscation   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setAccname("Manya PAtel");
		acc.setEmail("mmm@gmail.com");
		acc.setBalance(5000);
		
		
		
		Transcation tcs = new Transcation();
		tcs.deposite(acc, 3000);
		
		System.out.println(acc);
		
		
		tcs.withdraw(acc, 1000);
		
		System.out.println(acc);
	}

}
