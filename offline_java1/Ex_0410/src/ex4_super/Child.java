package ex4_super;

public class Child extends Parent{
	
	public Child() {
//		super(); // �θ� Ŭ���� ������ ȣ��. �⺻������ ���� �ʾƵ� �ڵ����� �پ� ����
//		�ٸ�, �θ� Ŭ������ �����ڿ��� �Ķ���͸� ������, ������ �� ����.
		super(1); // �� � ��ɺ��� �� ���� �;� �� (�׻� �θ�Ŭ���� ������ ���� �۵�)
		System.out.println("�ڽ� Ŭ����");
	}
	
	@Override
	public int result() {
		// TODO Auto-generated method stub
		return super.result(); // �⺻������ �������̵��ϸ� �θ��� �ش� �޼ҵ带 �״�� ����
	}
}
