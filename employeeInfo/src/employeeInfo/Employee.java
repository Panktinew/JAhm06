package employeeInfo;

public class Employee {
	
	private String ename,email;

//constructor with no parameters
	public Employee() {
		
		ename="Default";
		email="default@.com";
	}
	
	
	


	public Employee(String ename, String email) {
	 
	this.ename = ename;
	this.email = email;
}





	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + "]";
	}

}
