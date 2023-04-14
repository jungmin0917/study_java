package ex5_Thread;

import java.util.stream.IntStream;

public class SleepThread extends Thread {
	
	// sleep() : �����带 ������ �ð� ���� blocked ���·� �����.
	// �ð��� 1000���� 1�� ������ ������ �� ������, ������ �ð��� ������ ������� �ٽ� Runnable ���·� ���ư���.
	
	@Override
	public void run() {
		System.out.println("ī��Ʈ�ٿ� 5��");
		IntStream.rangeClosed(1, 5).forEach(i -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(5 - i);
		});
		
		System.out.println("����!");
	}
}
