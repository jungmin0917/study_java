package ex7_try_catch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		// 자바에서 프로그램이 실행되는 도중 예외 (오류, 에러, 버그)가 발생하면, 일반적으로 그 시점에서 프로그램이 종료된다.
		// 하지만 예상 가능한 오류가 있거나, 오류가 발생하더라도 이를 무시하고 이후의 작업을 진행해야 할 경우가 있다.
		// 예외 처리를 통해 프로그램의 비정상적인 종료를 줄여보자
		
		// 예상 가능한 오류 : 키보드에서 값을 받을 때 원하는 타입이 아닌 다른 타입으로 받으면 나는 오류
		
		// 예를 들어보자
		int result = 0;
		char[] arr = new char[3];
		
		// try 안에는 오류가 날만한 코드 위주로 적는 것이 좋다
		try {
			result = 10 / 0; // ArithmeticException
			arr[3] = 'A'; // ArrayIndexOutOfBoundsException
		}catch(ArithmeticException e) {
			System.out.println("정수는 0으로 나눌 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 방에 값을 넣을 수 없습니다");
		}catch (Exception e) {
			System.out.println("기타 에러가 발생했습니다");
		}
	}
}
