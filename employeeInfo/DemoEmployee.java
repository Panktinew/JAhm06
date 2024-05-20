package employeeInfo;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee();
		
		e1.setEname("Pankti");
		e1.setEmail("pankti283@gmail.com");
		
		Employee e2 = new Employee();
		
		e2.setEname("Pankti1");
		e2.setEmail("pankti@gmail.com");
		
		
		//System.out.println(e1.getEname() +  "  " +e1.getEmail()) ;

		
		System.out.println(e1);   //e1.toString()
		
		System.out.println(e2);
	}

}
