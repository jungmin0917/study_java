package ex1_Array;

import java.util.Arrays;

public class Ex2_Array {
	public static void main(String[] args) {
//		char[] arr = new char[4];
		
		// ���� ���� new Ű���带 ���� �� ��ü�� �����Ѵ�. (���� �޸𸮰� �Ҵ�ȴ�)
		
//		arr[0] = 'J';
//		arr[1] = 'A';
//		arr[2] = 'V';
//		arr[3] = 'A';
//		
//		for (int i = 0; i < arr.length; i++) {
////			System.out.printf("ch[%d] : %c\n", i, arr[i]);
//			System.out.printf("%c", arr[i]);
//		}
//		
//		System.out.println("=======================");
//		System.out.println(arr);
		
		String[] str = new String[3];
		
		str[0] = "Hello";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		// �Ϲ������� String�� �ʱ�ȭ�� ���� �� null�� ����ִ�
		
//		System.out.println(str); // ��ü�� �׳� ����ϸ� ��ü�� ���õ� ������ ��µȴ�
		// ���� ����ϰ� �ʹٸ� Arrays.toString() �޼ҵ带 �̿��ϸ� �ȴ�
		
		System.out.println(Arrays.toString(str));
	}
}
