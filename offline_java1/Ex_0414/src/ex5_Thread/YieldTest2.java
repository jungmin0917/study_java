package ex5_Thread;

public class YieldTest2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("¡Ù");
		}
	}
}
