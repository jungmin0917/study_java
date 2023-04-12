package ex7_try_catch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		
		int res = 0;
		int[] arr = new int[2];
		
		try {
//			res = 10 / 0;
			arr[2] = 10;
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index로의 접근입니다");
		} finally {
			// try 영역에서의 예외 발생 여부와 관계 없이 무조건 실행할 부분
			
			System.out.println("finally");
		}
	}
}
