package day08;

public class ForTest {
	public static void main(String[] args) {
//		반복 횟수가 몇 번인지 알 경우 for를 사용한다
//		for가 실행되는 원리
//		조건식이 참일 경우 반복하고 거짓이면 탈출한다
		
//		for(자료형 변수명 = 초기치; 조건식; 증감치) {
//			// 조건식이 참일 경우 실행할 문장
//		}
		
		int sum = 0; // sum을 선언만 하고 초기화시키지 않으면 초기값이 뭔지 모른다
		// 그래서 변수는 사용하기 전에 초기화를 해줘야 한다
		
		for (int i = 1; i <= 100; i++) {
			sum += i; // 대입연산자 이용 (sum = sum + i와 같음)
		}
		
//		대입 연산자 : +=, -=, *=, /=, %=
		
//		증감 연산자 : ++ : 1증가, -- : 1감소
//		++a : 변수 a에 저장된 값을 1 증가를 먼저 시키고 사용
//		a++ : 변수 a에 저장된 값을 사용 후 1 증가시킴
//		--a, a--도 마찬가지임
		
		int a = 1, b, c; // 이렇게 한 번에 선언할 수도 있음
		
		b = a++; // b는 1이고 a는 2가 됨
		c = ++a; // a는 3이 되고 c는 3이 됨
		
		System.out.printf("1 ~ 100 summary : %d\n", sum);
		
//		아래는 대강 연산자 연산순위
//		() 안의 수식 => 산술 연산자(*, /, %) => 산술 연산자(*, -) => 관계 연산자 => 논리 연산자 => 대입 연산자
//		단항 연산자 => 이항 연산자 => 삼항 연산자
		
		int d = 1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.printf("d = %d, e = %d", d, e);
		
	}
}