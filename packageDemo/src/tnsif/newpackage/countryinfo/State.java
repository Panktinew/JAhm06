package tnsif.newpackage.countryinfo;

public class State {

	
	private String sname;

	public State() {
		 
		this.sname = "";
	}
	
	public State(String sname) {
		super();
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "State [sname=" + sname + "]";
	}
	
	
	
	
}
