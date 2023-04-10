package ex2_animal;

public class Cat extends Animal {
	
	// 부모의 값을 그대로 받아서 써도 됨 (눈, 다리 개수가 기본값과 같음)
	private String balance = "귀엽다";
	
	public Cat() {;}

	// 메서드 오버라이딩 (같은 이름, 같은 매개변수 및 타입의 함수를 재정의)
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}
