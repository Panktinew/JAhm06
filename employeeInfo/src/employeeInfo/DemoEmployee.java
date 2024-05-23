package employeeInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee();  //constructor is going to be called automatically
		
		
		System.out.println(e1);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your email");
		
		
		
		int no =     Integer.parseInt(br.readLine());
		
		String em = br.readLine();
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your email");
		*/
		
		
		 

		
		
		
		
		Employee e21 = new Employee("test","test@test.com");
		
		
		System.out.println(e21);
		
		String email = sc.next();
		
		
		
		e1.setEname(name);
		e1.setEmail(email);
		
		Employee e2 = new Employee();
		
		e2.setEname("Pankti1");
		e2.setEmail("pankti@gmail.com");
		
		
		//System.out.println(e1.getEname() +  "  " +e1.getEmail()) ;

		
		System.out.println(e1);   //e1.toString()
		
		System.out.println(e2);
	}

}
