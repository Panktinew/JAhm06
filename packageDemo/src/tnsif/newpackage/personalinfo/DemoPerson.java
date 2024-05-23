package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Country c = new Country("India");
		State s = new State("Gujarat");
		Person p = new Person("Pankti",c,s,100000,45);
		
		
		
		
		
		System.out.println(p);
		
		
		
		TaxCalculation tc = new TaxCalculation();
		tc.calculateTax(p);
				
		
		
		
		
		Country c1 = new Country();
		State s1 = new State();
		Person p1 = new Person();
		
		
		c1.setCname("India");
		
		s1.setSname("Gujarat");
		
		p1.setC1(c1);
		p1.setS1(s1);
		
		p1.setPname("Rahul");
		p1.setAge(19);
		p1.setIncome(200000);
		
		System.out.println(p1);
		
		tc.calculateTax(p1);
		
		

	}

}
