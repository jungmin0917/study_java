package ex3_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		// ������ �ҽ��� ������ �Ʒ��� ������� ����ǳ�,
		// �����带 ����ϸ� ����� ���ķ� ����ȴ�
		
		MyThread mt = new MyThread();
		mt.start(); // run() �޼��带 ȣ���ϴ� �޼���
		
//		mt.run();
		
		MyThread2 mt2 = new MyThread2();
		Thread t = new Thread(mt2);
		t.start();
		
//		t.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("���� �Լ� ���� �� : " + i);
		}
	}
}
