package ex2_String_method;

import java.util.Arrays;

public class Ex1_String_method {
	public static void main(String[] args) {
//		�� ���� String Ŭ������ ������ �޼ҵ忡 ���� �˾ƺ���
		
//		��ü ���� �⺻
//		Ŭ������ ��ü�� = new Ŭ������();
		
//		�ش� Ŭ������ �޼ҵ� ȣ�� : ��ü��.�޼ҵ��()
		
		String str = "Jung Min";
		System.out.println("str�� ���� : " + str.length());
		
		System.out.println("���ڿ��� �ش� ���� index�� ��ġ : " + str.indexOf("M"));
		System.out.println("���ڿ��� �ش� ���� index�� ��ġ : " + str.indexOf("a"));
		// indexOf �� ������ -1�� ��ȯ, ������ �ش� ��ġ�� ��ȯ��
		
		System.out.println("���ڿ��� index ��ġ�� ���� : " + str.charAt(5));
		// charAt�� �ش� �ε����� ���ڸ� ��ȯ��	
		
		System.out.println("���ϴ� ���ڿ� �����ϱ� : " + str.substring(4));
		System.out.println("���ϴ� ���ڿ� �����ϱ� : " + str.substring(4, 6));
		// substring�� ���ϴ� �κ��� ���ڿ��� �����Ѵ�.
		// �����ε��� ���� �Ű������� 1���� �Ŷ� 2���� �Ŷ� �ٸ�
		
		System.out.println("���ڿ� �ڸ��� : " + Arrays.toString(str.split(" ")));
		// split()�� delimiter (������)�� �����Ͽ� �迭�� ��ȯ�Ѵ�
		
		String number = "100";
		// ���ڰ� ��� �ִ� ���ڿ��� ���������� �ٲٴ� ��
		
		int n = Integer.parseInt(number);
		// Integer Ŭ������ parseInt �޼ҵ带 �̿��Ѵ�.
		System.out.println(n);
		
		String s = Integer.toString(n);
		System.out.println(s + 10);
	}
}
