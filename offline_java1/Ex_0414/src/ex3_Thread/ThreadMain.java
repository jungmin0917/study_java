package ex3_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 원래는 소스가 위부터 아래로 순서대로 실행되나,
		// 쓰레드를 사용하면 명령이 병렬로 실행된다
		
		MyThread mt = new MyThread();
		mt.start(); // run() 메서드를 호출하는 메서드
		
//		mt.run();
		
		MyThread2 mt2 = new MyThread2();
		Thread t = new Thread(mt2);
		t.start();
		
//		t.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("메인 함수 진행 중 : " + i);
		}
	}
}
