package ex5_Thread;

public class YieldTest1 implements Runnable{
	// yield() : �ڽ��� �ð��� �纸�ϴ� �޼���
	// �����尡 �۾��� �����ϴٰ� yield()�� ������, �ڽſ��� �Ҵ�� �ð��� ���� ���� �����忡�� �絵��
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("��");
			Thread.yield(); // ���� �����带 ���� ������ ���·� �ٲٰ� �ٸ� �����忡�� �ð��� �絵
		}
	}
}
