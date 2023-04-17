package ex5_Thread;

public class JoinMain {
	public static void main(String[] args) {
		
		JoinTest1 jt1 = new JoinTest1();
		JoinTest2 jt2 = new JoinTest2();
		
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);

		// t2를 먼저 시작하고 나머지 스레드를 block 상태로 만들자
		t2.start();

		try {
			t2.join(); // t2를 제외한 나머지 스레드를 block 상태로 만듦.
		} catch (InterruptedException e) { // 간섭 예외
			e.printStackTrace();
		}
		
		t1.start();
		
		// t1도 join한다
		try {
			t1.join(); // t1 스레드를 제외한 나머지 스레드를 block 상태로 만듦.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 메인 스레드
		for (int i = 0; i < 10; i++) {
			System.out.println("메인 스레드 : " + i);
		}
		
		// 위와 같이 사용하면, 그냥 run() 메소드로 실행한 것 처럼 순서대로 실행됨을 확인할 수 있다.
		
	}
}
