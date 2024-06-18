package finalexample;

 final class  Test{
	
}


public class FinalExample1 {
 
	
	private int score;
	private final int per;  //data member
	
	public FinalExample1( int k) {
		 
		per = k++;
	}
	
	public void display() {
		
	final int val=0; 	
		
	 int r = per*12;
	 System.out.println(r + per);
	}
	
	// can not override final function
	public final void SayHello() {
		System.out.println("we learn final ");
	}
	
}
