package ex6_object;

public class ExtendsMain {
	public static void main(String[] args) {
		ExtendsEx1 v1 = new ExtendsEx1();
		
		v1.setValue("TEST");
		// ���ڰ� Object������ String�� Object�� ��ӹ޾����Ƿ� ���ڷμ� ����� �����ϴ�.
		
		System.out.println(v1.getValue());
		
		ExtendsEx1 v2 = new ExtendsEx1();
		
		v2.setValue(100); // AutoBoxing (�ڵ� ����ȯ : �⺻�ڷ��� -> ��ü(���� Ŭ����))
		
		System.out.println(v2.getValue()); // �̰� �׳� println�� Object�� ����� �� �־ �׷�
		System.out.println((int)v2.getValue() + 1); // Unboxing�� �ڵ����� �� �ǰ� ��������� �ؾ� ��
		
		
	}
}
