package tnsif.newpackage.personalinfo;

public class TaxCalculation {
	
	public void calculateTax(Person p ) {
		double tax=0.0;
		
		if(p.getAge() >=18) {
			
			
			if(p.getIncome() >=50000  && p.getIncome() <70000) {
				   
				tax = p.getIncome() * 0.05;
			}
			else if(p.getIncome() >=70000  && p.getIncome() <100000) {
				tax = p.getIncome() * 0.10;
				
				
			}
			
			else if(p.getIncome() >=100000 ) {
				tax = p.getIncome() * 0.15;
				
				
			}
			else {
				System.out.println("No Tax");
			}
			
		}
		else
		{
			System.out.println("No Tax");
		}
		
		System.out.println("tax="+ tax);	
	}

}
