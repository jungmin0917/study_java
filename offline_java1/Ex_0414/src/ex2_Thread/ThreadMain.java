package ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
//		단순히 아래와 같이 호출하지 않는다.
//		tt.run();
		
//		아래와 같이 start() 메소드로 쓰레드를 실행시킨다.
		tt.start();
		
		RunnableTest rt = new RunnableTest();
//		Runnable 객체를 구현한 클래스로는 start()로 시작하지 못한다.
//		아래와 같이 Thread 객체를 생성하여 그 안에 Runnable 객체를 구현한 클래스를 전달한 후 start() 메소드를 사용한다.
		Thread t1 = new Thread(rt);
		t1.start();
	}
}
