package ex4_Thread;

public class MainThread {
	public static void main(String[] args) {
		ThreadName tn = new ThreadName();
		tn.start();

		System.out.println("���� ����ǰ� �ִ� �������� �̸� : " + Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : " + Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱���� : " + Thread.currentThread().getPriority());
	}
}
