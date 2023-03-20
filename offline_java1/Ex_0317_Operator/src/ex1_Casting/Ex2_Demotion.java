package ex1_Casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		
		// 강제 형변환 (명시적 형변환) : 큰 자료를 작은 자료형에 대입
		
		char c = 'B'; // 2byte
		int n = c + 1; // 묵시적 형변환 (작은 자료를 큰 자료에 넣었으므로)
		
		c = (char)n; // 큰 데이터를 작은 자료형에 넣고 싶다면 형변환을 해서 넣으면 들어간다
		
		float f = 5.5f;
		
		int n1 = 0;
		n1 = (int)f; // int와 float는 같은 4바이트여도 자료형이 일치하지 않아 대입이 되지 않는다
//		int는 정수 자료형이고, float는 실수 자료형이기 때문이다.
//		그래서 위와 같이 명시적 형변환을 해줘야 한다
		
//		float에서 int로 명시적 형변환을 하면 실수부는 버리게 된다
		
//		System.out.println(n1);
		
		byte b1 = 100;
		byte b2 = 20;
//		byte b3 = b1 + b2; // 넘치지 않는데도 오류가 남
		// 자바는 b1 + b2 연산 시 그 결과가 127을 넘지 않더라도 int형이 되도록 설계를 했음
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
	}
}
