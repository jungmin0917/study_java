package ex6_static;

public class Bank {
	// 은행이 지역별로 있는데, 각 은행에 대한 이자가 일괄적으로 바뀔 수 있게 하는 것
	
	// 변수가 static으로 선언되면, 객체를 생성하지 않고도 해당 변수를 사용할 수 있다.
	
	// static 변수를 가지는 객체를 아무리 많이 생성해도, static 변수는 메모리에 한 번만 만들어진다.
	
	private String name = "우리은행";
	private String point; // 지점
	private String tel; // 전화번호
	static double interest = 10; // 이자율
	
	// 생성자 정의
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", point=" + point + ", tel=" + tel + ", interest=" + interest + "]";
	}
	
	public void printBank() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("위치 : %s\n", point);
		System.out.printf("전화번호 : %s\n", tel);
		System.out.printf("이자율 : %.2f%%\n", interest);
		System.out.println("-------------------------");
	}
	
}
