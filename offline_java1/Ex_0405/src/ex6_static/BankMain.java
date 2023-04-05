package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("강남", "010-1234-1234");
		Bank b2 = new Bank("분당", "010-2345-2345");
		Bank b3 = new Bank("대전", "010-3455-3445");
		
		// 이런 상황에서 b1.interest = 5, b2.interest = 5 이렇게 바꾸면 상당히 귀찮다.
		Bank.interest = 5; // 이런 식으로 클래스명.정적변수명으로 설정을 하면 나머지도 전부 바뀐다. (이미 객체가 잔뜩 생성됐더라도)
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
	}
}
