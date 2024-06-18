package abstractExample;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// can not create object of abstract class
		
		//MyTest mt = new MyTest();  
		
		Addition ad = new Addition();
		ad.showResult();

		
		
		Sub s1 =  new Sub(34.6f,12.1f);
		s1.showResult();
}
}