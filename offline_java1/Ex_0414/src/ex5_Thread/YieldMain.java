package ex5_Thread;

public class YieldMain {
	public static void main(String[] args) {
		
		YieldTest1 yt1 = new YieldTest1();
		Thread t1 = new Thread(yt1);

		YieldTest2 yt2 = new YieldTest2();
		Thread t2 = new Thread(yt2);
		
		t1.start();
		t2.start();
		
	}
}
