package ex1_Array;

import java.util.Arrays;

public class Ex2_Array {
	public static void main(String[] args) {
//		char[] arr = new char[4];
		
		// 위와 같이 new 키워드를 통해 새 객체를 생성한다. (힙에 메모리가 할당된다)
		
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
		
		// 일반적으로 String은 초기화만 했을 때 null이 들어있다
		
//		System.out.println(str); // 객체를 그냥 출력하면 객체에 관련된 정보가 출력된다
		// 굳이 출력하고 싶다면 Arrays.toString() 메소드를 이용하면 된다
		
		System.out.println(Arrays.toString(str));
	}
}
