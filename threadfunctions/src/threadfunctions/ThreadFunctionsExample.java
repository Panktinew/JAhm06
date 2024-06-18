package threadfunctions;

class A extends Thread{
	
	@Override
	public void run()
	{
		
		for(int i=0;i<100;i++) {
			System.out.println("Have a nice DAy!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
			
	
}

class B extends Thread{
	@Override
	public void run()
	{
		
		for(int i=0;i<100;i++) {
			System.out.println("Let us learn thread today");
		 	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadFunctionsExample {

	public static void main(String[] args) {

		
		A thread1 = new A();   //new born
		B thread2 = new B();
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		thread1.setName("Th1");
		thread2.setName("Th2");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		
		thread1.start();   // runnable state --- tellimg compiler that thread is ready for excution
		
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread1.isAlive());
/*		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/	System.out.println(thread1.isAlive());
		thread2.start();
		
		
		System.out.println("Bye Bye ....");
		

	}

}
