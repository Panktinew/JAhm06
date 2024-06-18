package exceptionExample.simpleexception;

public class Exception1 {

	public static void main(String[] args) {
		
		
		int a,b,result;
		a=12;
		 
		try {
			
			int[] arr = {2,3,10,5,7,8};
			
			for(int i : arr) {
				result = a/arr[i];
			}
			
			 
			
			int result1 = a/arr[6];
			     
			}
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar.getMessage());
		}
		 
		catch(Exception e) {
			
			System.out.println( "number can not be "+e.getMessage());
		}
		finally {
			System.out.println("Bye... Bye...");
		}
		
		 
		
	
	}

}
