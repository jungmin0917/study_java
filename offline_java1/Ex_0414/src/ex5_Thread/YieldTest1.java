package ex5_Thread;

public class YieldTest1 implements Runnable{
	// yield() : 자신의 시간을 양보하는 메서드
	// 스레드가 작업을 수행하다가 yield()를 만나면, 자신에게 할당된 시간을 다음 차례 스레드에게 양도함
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("★");
			Thread.yield(); // 현재 스레드를 실행 가능한 상태로 바꾸고 다른 쓰레드에게 시간을 양도
		}
	}
}
