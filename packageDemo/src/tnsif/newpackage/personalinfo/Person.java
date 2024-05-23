
package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;


public class Person {
	
	private String pname;
    private Country c1;
    private State s1;
	private int income;
	private int age;
    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Person()
    {
    	
    }
    
    
	public Person(String pname, Country c1, State s1, int income,int age) {
	 
		this.pname = pname;
		this.c1 = c1;
		this.s1 = s1;
		this.income = income;
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Country getC1() {
		return c1;
	}
	public void setC1(Country c1) {
		this.c1 = c1;
	}
	public State getS1() {
		return s1;
	}
	public void setS1(State s1) {
		this.s1 = s1;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + ", income=" + income + ", age=" + age + "]";
	}

	
	
	
	
	
}
