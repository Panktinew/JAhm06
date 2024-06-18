package inheritanceExample;

public class BaseClass  {
	
	
	private int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "BaseClass [amt=" + amt + "]";
	}
	
	

}
