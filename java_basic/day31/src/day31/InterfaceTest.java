package day31;

class Point {
	int x, y;
	public void move() {};
}

class Shape {
//	변수 앞에 final이 붙으면 그 변수는 프로그램에서 값을 변경할 수 없음
//	프로그램에서 자주 사용하고, 변하지 않을 데이터는 상수 키워드인 final을 붙이면 좋다
	public static final double PI = 3.141592; // 정적 멤버 변수 (상수)
	public void draw() {};
	public void erase() {};
}

// 자바는 다중 상속을 허용하지 않는다.
// class Line extends Point, Shape {}; // 에러 발생

// 이런 문제를 해결하기 위해 인터페이스(Interface)를 사용한다
// 인터페이스란 정적(static) 멤버 변수와 추상 메소드로만 구성된 클래스의 특별한 형태이다
interface Draw {
	public static final double PI = 3.141592; // 정적 변수
	
//	인터페이스는 멤버 변수 선언 시 'public static final'을 생략하면 자동으로 붙여준다.
	int LIMIT = 1000;

	public abstract void moveTo(); // 추상 메소드
	
//	인터페이스는 추상 메소드 선언 시 'public abstract'를 생략하면 자동으로 붙여준다.
	void erase(); // 추상 메소드
}

interface Graphic {
	void rotate(); // 추상 메소드
	void resize(); // 추상 메소드
}

// class Line extends Draw {}; // 클래스는 인터페이스를 상속받을 수 없기 때문에 에러가 발생한다.
// interface Graphics extends Point {}; // 인터페이스는 일반 클래스를 상속받을 수 없기 때문에 에러가 발생한다.

// 클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속을 시켜야 한다.

interface Graphics extends Draw, Graphic{ // 인터페이스는 다중 상속이 가능하다.
	// 아무런 내용도 가지지 않는 인터페이스를 표시(marker) 인터페이스라 부른다
}

// 클래스 선언 시 인터페이스에서 정의한 내용을 사용하려면 상속(extends)을 사용할 수 없고 구현(implements)을 사용한다.
// Line 클래스는 Point 클래스를 상속받고 Draw 인터페이스와 Graphic 인터페이스를 구현해서 만든다.
// Point 클래스는 상속을 받고, Draw, Graphic이라는 인터페이스를 가져와서 구현해서 쓰겠다는 뜻
class Line extends Point implements Draw, Graphic {

	// 필수로 구현할 추상 메소드 오버라이딩
	@Override
	public void moveTo() {

	}
	@Override
	public void rotate() {

	}
	@Override
	public void resize() {

	}
	@Override
	public void erase() {

	}
	
}

// static 키워드가 붙은 멤버변수나 메소드는 인스턴스 생성 없이 바로 갖다 쓸 수 있음
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Shape.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
	}
}
