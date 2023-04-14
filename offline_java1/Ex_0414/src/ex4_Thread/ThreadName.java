package ex4_Thread;

public class ThreadName extends Thread{
	
	@Override
	public void run() {
		this.setName("Thread3"); // 현재 쓰레드의 이름을 Thread3이라고 설정함
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority());
	}
}
