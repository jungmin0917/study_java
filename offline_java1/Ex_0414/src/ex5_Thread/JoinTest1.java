package ex5_Thread;

public class JoinTest1 implements Runnable {
	
	// Thread ��ü�� join() : Ư���� �����尡 �۾��� ���� ������ �� �����
	// ���� ������ ���Ѿ� �ϴ� �����带 ������ �� ����Ѵ�.
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t1 : " + i);
		}
		
		System.out.println("<<t1 �Ϸ�>>");
	}
}
