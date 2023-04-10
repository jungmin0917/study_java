package ex1_inheritance;

public class Child extends Parent{
	
	// 상속받는 키워드로 extends를 사용한다
	
	String car = "아반떼";
	
	public Child() {;}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
}
