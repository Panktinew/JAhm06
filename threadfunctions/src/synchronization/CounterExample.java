package synchronization;

class CounterNo{
	
	int cnt;
	public synchronized  void get_Increment() {
		cnt++;  //cnt = cnt+1  600
	}
}


public class CounterExample {

	public static void main(String[] args) {
		 
		
		CounterNo cn = new CounterNo();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
					for(int i=0;i<1000;i++) {
						cn.get_Increment();
						 
					}
	
			}
		});
		
		
		
       Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
					for(int i=0;i<1000;i++) {
						cn.get_Increment();
						 
					}
	
			}
		});
		
		
		
	t1.start();
	t2.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	//cn.get_Increment();
		 
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	System.out.println(cn.cnt);
	}

}
