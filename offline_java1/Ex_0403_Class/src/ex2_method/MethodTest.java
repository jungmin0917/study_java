package ex2_method;

import java.util.stream.IntStream;

public class MethodTest {

	// f(x) = 2x + 1; // x가 매개변수
	
	// 아래처럼 반환형만 다르면 오버로딩 안 됨
	public int f(int x) {
		return 2*x + 1;
	}
	
	public void f2(int x) {
		System.out.printf("f(%d) = %d", x, 2*x + 1);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
//	1부터 10까지 출력하는 oneToTen 함수 만들기
	public String oneToTen() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			sb.append(i).append("\n"); 
		}

		return sb.toString();
	}
	
//	1부터 10까지 더해서 출력하기
	public int getTotal() {
		return IntStream.rangeClosed(1, 10).sum();
	}
	
//	정수 하나 받아서 구구단 만들기 (근데 1000000 이하로만 받기. long나오면 골치 아픔)
	public String gugudan(int n) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 9; i++) {
			String str = String.format("%d * %d = %d", n, i, n*i);
			
			sb.append(str).append("\n");
		}
		
		return sb.toString();
	}
	
	public int valueTest(int x) {
		x++;
		return x;
	}
}














