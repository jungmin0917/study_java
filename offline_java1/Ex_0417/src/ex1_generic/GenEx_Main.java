package ex1_generic;

public class GenEx_Main {
	public static void main(String[] args) {
		// ���׸� Ÿ�����δ� Ŭ�������� �����ϴ� (�⺻ Ÿ�� �� ��)
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("test");
		
		System.out.println(v1.getValue());
		
		// ������ ������ GenEx ��ü �����
		// ���׸� Ÿ���� �⺻ �ڷ����� �ν����� �ʴ´�.
		// ����, int, double ���� �⺻ �ڷ����� ���׸� Ÿ������ �̿��ϰ��� �� ����,
		// ���� Ŭ���� (Wrapper Class)�� �̿��Ѵ�.
		
		// int -> Integer, char -> Character, float -> Float, double -> Double ���� �ִ�.
		
		GenEx<Integer> v2 = new GenEx<>(); // ���� �ڿ� ������ �ʿ��� ���׸� �ȿ� Ÿ�� �����ص� �ȴ�.
		v2.setValue(1000);
		System.out.println(v2.getValue() + 20);
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(1.12);
		System.out.println(v4.getValue());
	}
}
