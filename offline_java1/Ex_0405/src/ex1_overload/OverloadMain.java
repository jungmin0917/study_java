package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		
		Ex1_Overload ol = new Ex1_Overload();
		
		ol.result();
	
		ol.result(1);
		
		ol.result('C');
		
		ol.result("test", 10);
		
		ol.result(10, "test");
		
		// ���� ��� println�� ���� �ڷ����� ���� �ʳ�.
		// �� �Լ����� ���� �پ��� �����ε��� �Ǿ��ִ�.
		
		System.out.println(100);
		System.out.println("100");
		System.out.println('A');
		System.out.println(3.14);
	}
}
