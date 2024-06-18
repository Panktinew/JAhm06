package exceptionExample.throwexample;

public class ThrowExample {

	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		try {
				if(marks <0) {
					throw new Exception();
				}
				else {
				this.marks = marks;
				}
		}catch(Exception ar) {
			System.out.println("MArks should not be negative");
		}
	}

	@Override
	public String toString() {
		return "ThrowExample [marks=" + marks + "]";
	}
	
	
	
	
}
