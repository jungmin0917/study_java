package ex6_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
//		int a = 20;
//		int b = 10;
//		
//		System.out.printf("%d + %d = %d", a, b, a + b);
		
//		printf : 문자열과 변수에 들어있는 데이터를 편하게 출력할 수 있도록 도와주는 포맷 형식
//		printf의 f는 format이라는 뜻
		
//		형식 지정자
//		%d : 정수형
//		%c : 문자형
//		%s : 문자열
//		%f : 실수형
		
		int age = 30;
		
//		System.out.printf("저의 나이는 %d살 입니다\n", age);
//		
//		System.out.printf("저의 나이는 %d세이고 키는 %dcm입니다\n", 30, 175);
//		
//		// 원주율은 3.141592입니다
//		
//		System.out.printf("원주율은 %.6f입니다", Math.PI);
		
		for (int i = 1; i <= 12; i++) {
			System.out.printf("%3d", i);
		        
	        if(i % 4 == 0){
	            System.out.println();
	        }
		}
		
		
	}
}
