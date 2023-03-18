package day29;

// 자식(하위, 서브, 파생) 클래스
// 부모 클래스를 상속받아 자식 클래스를 만들기

// 사용법 : 접근자 class [자식클래스명] extends [현재클래스명]
public class Child extends Parent{
//	여기서는 Parent 클래스를 상속받았으므로 Parent 클래스에 있는 모든 멤버변수(필드)와 메소드를 별도로 정의하지 않아도 사용할 수 있다.
	
//	하지만 부모 클래스의 private 권한을 가진 멤버는 상속은 받았지만 접근할 수는 없다.
	private int age;
	private String nickName;
	
	// 기본 생성자
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
//	자동완성 기능을 사용해도 상속받은 클래스에 있는 private 멤버변수는 보이지 않는다.
//	그래서 그런 멤버변수들은 직접 선언해서 사용하여야 한다 (그냥 this.~~로 접근하면 보이지 않음)
//	부모 클래스로부터 상속받은 멤버변수의 접근 권한이 private일 경우, 부모 클래스의 생성자를 호출하여 초기화시킨다.
//	부모 클래스의 생성자 강제 호출 : super();

	// 생성자 (부모클래스의 멤버변수가 private인 경우)
//	public Child(String name, boolean gender, int age, String nickName) {
//		super(name, gender); // 인수로 받은 name과 gender를 사용하여 부모 클래스에서 호출하여 현재 클래스에서 초기화시킴 (초기화시키지 않으면 아무리 자식 클래스에서 인수를 받아서 호출해도 기본값만 나온다)
//		this.age = age;
//		this.nickName = nickName;
//	}
	
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	
//	방법이 두 가지가 있는데, super() 메소드를 사용하여 부모 클래스를 호출하여 초기화시키는 방법이고
//	또 하나의 방법은, setter를 사용해서 부모 클래스의 멤버변수를 변경 후 getter를 사용하는 것이다
	
//	단, protected로 선언된 멤버변수의 경우, this로 자유롭게 접근이 가능하다

	// getter, setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
//		부모 클래스로부터 상속받은 멤버 변수의 접근 권한이 private이면 접근 불가능하므로 getter 메소드를 사용한다. (이건 protected가 아닌 이상 어떻게 해도 this로 바로 접근할 순 없음)
//		그래서 쓰라고 있는 게 getter, setter이다
		
//		부모 클래스의 멤버변수가 private인 경우
//		String sex = this.isGender() ? "male" : "female";
//		
//		String str = String.format("%s(%s)-%d, %s\n", this.getName(), sex, this.age, this.nickName);

		String sex = this.gender ? "male" : "female";
		
		String str = String.format("%s(%s)-%d, %s\n", this.name, sex, this.age, this.nickName);
		
		return str;
	}
	
	
}
