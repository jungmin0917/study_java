package ex4_Thread;

public class ThreadName extends Thread{
	
	@Override
	public void run() {
		this.setName("Thread3"); // ���� �������� �̸��� Thread3�̶�� ������
		System.out.println("���� ����ǰ� �ִ� �������� �̸� : " + Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : " + Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱���� : " + Thread.currentThread().getPriority());
	}
}
