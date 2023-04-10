package ex1_inheritance;

// 부모 클래스
public class Parent {
	// 상속
	// 자바에서도 클래스간 부모자식 관계가 존재하고, 부모의 재산 중 일부 혹은 전부를 자식이 물려받을 수 있다.
	// 다중 상속은 불가

	private int money = 200000000; // 부모의 재산
	private String land = "송도"; // 부모의 부동산
	
	public Parent() {;}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	
	
	
}
