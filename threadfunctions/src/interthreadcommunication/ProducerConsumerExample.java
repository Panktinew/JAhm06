package interthreadcommunication;


class Q{
	
	int num;
    boolean valueSet = false;
	public  synchronized void getNum() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get = " + num);
		valueSet=false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("set = " + num);
		this.num = num;
		valueSet=true;
		notify();
	}
	
	
}
class Producer implements Runnable{
Q q;

	
	public Producer(Q q) {
	
	this.q = q;
	
	Thread t = new Thread(this,"Producer");
	t.start();
}


	@Override
	public void run() {
	int i=0;	
	while(true) {
		q.setNum(i++);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}

class Consumer implements Runnable{
	
	Q q;
	
	
	public Consumer(Q q) {
		 
		this.q = q;
		
		Thread t = new Thread(this,"Consumer");
		t.start();
	}


	@Override
	public void run() {
		
		int i=0;
		while(true) {
			
			q.getNum();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ProducerConsumerExample {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		 
	}

}
