package ex1_computer;

// 클래스 (설계도)
public class Computer {
	// 멤버 변수, 멤버 메소드가 들어감 (설계도의 요소)
	
//	어떠한 것의 대량생산을 위한 설계도를 만드는 작업
//	클래스의 구성 요소
//	1. 멤버변수 (속성, 필드라고도 부름)
//	2. 메소드 (기능, 함수라고도 부름)
	
	int ssd; // ssd 용량
	int ram; // ram 크기
	double cpu; // CPU 클럭 속도
	String color; // 색상
	
	// 이제 함수를 만들어보자
	// 함수는 함수 안에서 정의될 수 없다.
	// 함수는 함수 밖에서 호출할 수 없다.
	
//	함수는 반복해서 사용하는 기능에 대해 정의해놓고 나중에 편하게 쓰는 것임
//	메서드란 어떤 작업문을 수행하기 위한 명령의 집합이다
//	반복적으로 쓰지 않기 위해서
//	정의해두고 필요할 때마다 쓰면 됨
	public void getInfo() {
		System.out.println("ssd: " + this.ssd);
		System.out.println("ram: " + this.ram);
		System.out.println("cpu: " + this.cpu);
		System.out.println("color: " + this.color);
		System.out.println("---------------------");
	}
	
//	메서드의 구성
//	접근제한자 (static여부) 반환자료형 메서드명(매개변수, 매개변수, ...){ 실행할 명령 }

//	접근제한자 종류
//	public : 모든 접근을 허용. 같은 프로젝트 내의 모든 클래스에서 호출 가능
//	private : 현재 클래스 내에서만 사용을 허가
//	protected : 상속 관계의 클래스에서만 사용을 허가
//	default : 같은 패키지 내의 클래스에서만 사용을 허가 (따로 적지 않으면 default)
	
//	해당 클래스의 반환자료형에 맞게 반환값을 리턴해야 함
//	메서드가 처음부터 끝까지 수행을 마친 후 반환해야 할 값이 있을 경우에 기입.
//	int, boolean, float, String, 각종 객체 등
//	기본 자료형, 각종 클래스, 사용자가 직접 만든 아무 클래스의 객체 모두 가능
	
//	이를 호출해서 쓸 때는 이렇게 사용한다
//	메서드명(매개변수, 매개변수, ...);
//	클래스명 첫글자는 반드시 대문자, 메소드명 첫글자는 반드시 소문자
	
//	반환값
//	return 반환값;
//	반환형의 자료형은 반환값과 일치해야 함
	
	// 기본 생성자 (기본값 처리)
	public Computer() {
		this.ssd = 1024;
		this.ram = 16;
		this.cpu = 4.8;
		this.color = "white";
	}

	// getter, setter
	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
