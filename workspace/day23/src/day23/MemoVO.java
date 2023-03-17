package day23;

import java.util.Date; // 요즘은 이거 잘 안 쓰고 java.time 패키지를 사용함

public class MemoVO {
	private int no;				// 객체가 생성될 때마다 자동으로 1씩 증가
	private String name;		
	private boolean gender;
	private String memo;
	private Date writeDate;		// 객체가 생성되는 순간의 날짜와 시간
	
//	생성자 메소드(이하 생성자)
//	생성자명은 반드시 클래스명과 같아야 한다.
//	생성자는 return을 가지지 않는다. return을 가지지 않는 메소드인 경우, 리턴타입에 "void"를 입력하는데, 생성자는 리턴타입을 쓰지 않는다.
//	생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어 준다. 하지만 사용자가 생성자를 선언하면 기본 생성자는 자동으로 생성되지 않는다.
//	생성자는 객체가 생성될 때 자동으로 실행되며, 멤버 변수를 초기화시키는 목적으로 사용된다.
	
//	아래는 자동으로 생성되는 기본 생성자의 모습이다
//	public MemoVO() {
//		// TODO Auto-generated constructor stub
//	}

//	아래의  코드에서 public MemoVO()는 MemoVO 클래스의 생성자이며, 
//	객체가 생성될 때 자동으로 호출되어 MemoVO 클래스의 멤버 변수를 초기화하는 역할을 한다.
//	자동으로 해당 클래스의 멤버 변수를 내 입맛대로 초기화해서 쓰기 위해 만드는 것이다.
	public MemoVO() {
//		System.out.println("The default constructor runs.");
//		멤버 변수 초기값 세팅하기 위한 두 가지 방법
//		하나는 아래와 같이 일일이 입력
//		name = "무명씨";
//		gender = false;
//		memo = "없음";
		
//		나머지 하나는 아래와 같이 아까 만들어 둔 생성자를 이용하기
		this("무명씨", false, "없음");
		
//		this()는 같은 클래스 내의 다른 생성자를 호출하는 특별한 형태의 메소드이다.
//		클래스 내에 여러 개의 생성자가 있을 때, 한 생성자에서 다른 생성자를 호출하고 싶을 경우 this()를 사용한다.
//		이때, this()는 반드시 해당 생성자의 첫 번째 실행문으로 사용되어야 한다.
	}
	
//	이제 위에 name, gender, memo를 초기화하는 메소드를 만들어보자
//	public MemoVO(String name, boolean gender, String memo) { // 여기서 name, gender, memo는 지역변수로서, 해당 중괄호 안에서만 사용할 수 있다. 그래서 그냥 사용하면 이게 
//		
//		같은 {} 블록에 같은 이름을 가지는 지역 변수와 멤버 변수가 있을 경우, 지역 변수에 우선권을 준다.
//		name = this.name; // 이렇게 하면 멤버변수의 값을 지역변수 안에 넣겠다는 것
//		this.name = name; // 이렇게 하면 지역변수의 값을 멤버변수 안에 넣겠다는 것
//		this.멤버변수명 : 현재 클래스의 멤버변수의 값을 가져옴
//		
//		아래와 같이 일일이 하는 것도 큰일임 (만약 멤버변수가 많으면 노가다임)
//		this.name = name;
//		this.gender = gender;
//		this.memo = memo;
//		
//	}
	
	
//	그래서 더 간편하게 멤버변수들을 초기화하는 방법은, 이클립스를 이용하면 된다.
//	우클릭 -> Source -> Generate Constructor using Fields... 를 누른다
//	Alt + Shift + S로도 가능

//	아래는 위 기능을 사용하여 생성된 생성자이다.
	public MemoVO(String name, boolean gender, String memo) {
		super(); // 부모 클래스의 생성자를 호출하는 메소드. 생략하면 컴파일 시 자동으로 super()를 넣어준다. 즉 생략 가능하단 말임.
		
//		super() : 부모 클래스의 생성자를 호출하는 메소드.
//		this() : 현재 클래스의 생성자를 호출하는 메소드.
//		super()와 this()는 반드시 생성자의 첫 줄에 적어야 한다. 그래서 두 개를 한 번에 같이 쓰지 못함.
//		super : 부모 클래스를 의미함
//		this : 현재 클래스를 의미함
		
		this.name = name;
		this.gender = gender;
		this.memo = memo;
	}
	
//	클래스 하나에 여러 개의 생성자를 정의하는 것을 오버로딩(Overloading)이라고 한다.
//	객체에 저장된 내용을 출력해야 한다면, toString() 메소드를 override(재정의)한다.
//	기본적으로 toString() 메소드는 "클래스 이름@해시코드" 형태의 문자열을 반환하도록 구현되어 있다.
//	그렇기에 이걸 좀 더 사용자가 원하는 정보를 출력하게 하려면 이클립스 기능을 이용하거나 직접 짜보자.
	
//	아래는 자동으로 오버라이딩된 toString 메소드이다
//	이걸 내 입맛대로 고쳐서 사용하면 된다
	@Override
	public String toString() {
//		return "MemoVO [name=" + name + ", gender=" + gender + ", memo=" + memo + "]";
		return name + "(" + (gender?"남자":"여자") + ")가 남긴 말 : " + memo;
	}
	
}
