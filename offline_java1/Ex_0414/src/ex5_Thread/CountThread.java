package ex5_Thread;

import java.util.stream.IntStream;

public class CountThread extends Thread{
	
	private int n;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void run() {
		
		System.out.println("d");
		
		System.out.printf("ī��Ʈ�ٿ� %d��\n", n);
		
		System.out.println(n);
		
		IntStream.rangeClosed(1, n).forEach(i -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("%d��\n", n - i);
		});
		
		System.out.println("ī��Ʈ�ٿ� ����");
	}
	
}
