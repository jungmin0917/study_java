package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		
//		Child Ŭ�������� ��ӹ��� Parent Ŭ������ ����鿡 ������ �� �ִ�.

		System.out.println(c1.getLand());
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());
		
		Parent p1 = new Parent();
		 // �θ𿡼� �ڽ��� ����� ������ ���� ����
//		System.out.println(p1.getCar());
		
		if(c1 instanceof Parent) {
			System.out.println("c1�� Parent�� �ν��Ͻ���");
		}
		
		if(c1 instanceof Child) {
			System.out.println("c1�� Child�� �ν��Ͻ���");
		}
	}
}
