package ex5_Thread;

import java.util.stream.IntStream;

public class SleepThread extends Thread {
	
	// sleep() : 스레드를 지정한 시간 동안 blocked 상태로 만든다.
	// 시간은 1000분의 1초 단위로 지정할 수 있으며, 지정된 시간이 지나면 스레드는 다시 Runnable 상태로 돌아간다.
	
	@Override
	public void run() {
		System.out.println("카운트다운 5초");
		IntStream.rangeClosed(1, 5).forEach(i -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(5 - i);
		});
		
		System.out.println("종료!");
	}
}
