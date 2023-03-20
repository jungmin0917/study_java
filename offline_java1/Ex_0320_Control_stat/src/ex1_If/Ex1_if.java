package ex1_If;

public class Ex1_if {
	public static void main(String[] args) {
//		제어문 : 코드의 흐름을 제어하는 문법
//		
//		조건문, 반복문 등이 있음
//		
//		조건문 : if, switch
//		반복문 : for, while
//		
//		if문
//		
//		기본형
//		if(조건식) {
//			// 조건이 참일 때 실행할 문장
//		}
//		중괄호로 감싸진 곳을 코드블럭이라고 한다
		
//		조건식 : 결과가 참, 거짓으로 반환되는 식 (논리연산자, 비교문 등)
		
		int n = 50;
		
//		int, float, double, char, boolean 등은 기본 자료형이다
//		String은 기본 자료형이 아닌 클래스이다

		// 무조건 초기화를 해주어야 함
		String str = "";
		
		if(n != 50) {
			str = "n is not 50";
		}
		
		System.out.println(str);
	}
}
