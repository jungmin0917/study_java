package ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
//		�ܼ��� �Ʒ��� ���� ȣ������ �ʴ´�.
//		tt.run();
		
//		�Ʒ��� ���� start() �޼ҵ�� �����带 �����Ų��.
		tt.start();
		
		RunnableTest rt = new RunnableTest();
//		Runnable ��ü�� ������ Ŭ�����δ� start()�� �������� ���Ѵ�.
//		�Ʒ��� ���� Thread ��ü�� �����Ͽ� �� �ȿ� Runnable ��ü�� ������ Ŭ������ ������ �� start() �޼ҵ带 ����Ѵ�.
		Thread t1 = new Thread(rt);
		t1.start();
	}
}
