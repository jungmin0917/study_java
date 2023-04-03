package ex3_computer;

public class Computer {
	
//	일반적으로 멤버변수, 멤버메소드는 전부 private으로 하고, getter, setter로 접근하도록 만든다
	private String brand;
	
	// 기본 생성자
	public Computer() {
		this.brand = "SAMSUNG"; // 기본값
	}

	// getter, setter
//	목적은 private으로 만들어진 변수의 값을 변경하거나 조회하게 하기 위해 사용
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
