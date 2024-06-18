package bankactivities;

public class Account {
	
	private String accname,email;
	private int balance;
	
	
	
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accname=" + accname + ", email=" + email + ", balance=" + balance + "]";
	}
	

}
