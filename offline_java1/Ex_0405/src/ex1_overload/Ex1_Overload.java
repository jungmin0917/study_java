package ex1_overload;

public class Ex1_Overload {
	
	public void result() {
		System.out.println("매개변수가 없는 메서드");
	}
	
	public void result(int n) {
		System.out.printf("정수를 인자로 받는 메서드 : %d\n", n);
	}
	
	public void result(char ch) {
		System.out.printf("문자를 인자로 받는 메서드 : %c\n", ch);
	}
	
	public void result(String s, int n) {
		System.out.printf("문자열 및 정수를 인자로 받는 메서드 :\n문자열: %s, 정수: %d\n", s, n);
	}
	
	public void result(int n, String s) {
		System.out.printf("정수 및 문자열을 인자로 받는 메서드 :\n정수: %d, 문자열: %s\n", n, s);
	}
	
}
