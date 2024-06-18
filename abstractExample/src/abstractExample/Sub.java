package abstractExample;

public class Sub extends MyTest {
float a,b;

public Sub(float a, float b) {
	 
	this.a = a;
	this.b = b;
}

@Override
public void showResult() {
	System.out.println(this.a - this.b);
}


}
