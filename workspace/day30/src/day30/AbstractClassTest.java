package day30;

// 자바는 원칙적으로는 파일 하나에 클래스 하나만 있지만, 경우에 따라 여러 개의 클래스가 있을 수 있다.
// 다만! 파일 이름과 같은 이름을 가지는 클래스에만 접근지정자를 붙일 수 있다.
// 파일 이름과 다른 이름을 가진 클래스는 오직 default(package-private) 접근 지정자만을 사용할 수 있습니다.
// (아무것도 안 붙이면 default 접근 지정자로 선언된다)

// 파일 이름과 다른 클래스

// 추상 클래스 : 한 개 이상의 추상 메소드를 포함한 클래스, 불완전한 클래스이기 때문에 객체를 만들어 사용할 수 없다.
// 순수하게 상속을 시키기 위해 만드는 클래스로, 추상 클래스를 상속받은 자식 클래스는 상속받은 추상 메소드를 반드시 오버라이드(재정의)하여 사용하여야 한다.
abstract class Product {
//	추상 메소드 : 아무런 일도 하지 않는 메소드로, {} 블록을 가지지 않는다.
//	abstract 예약어를 사용해서 만들 수 있다.
	
//	public void move() {}; // 아무런 일도 하지 않는 일반 메소드 (추상 메소드 아니고 그냥 아무것도 안 하는 일반 메소드)
	public abstract void move();
}

public class AbstractClassTest {
	public static void main(String[] args) {
//		추상 클래스에 대해
		
	}
}

// 추상 클래스 Product를 상속받아 Camera 클래스를 만든다
// 상속받아서 상속 메소드를 오버라이딩 하지 않으면
// The type Camera must implement the inherited abstract method Product.move()
// 위와 같은 에러가 난다 (상속받은 Product 클래스의 move 메소드를 오버라이딩하여 사용하라는 뜻)
class Camera extends Product {
	// Ctrl + Space로 자동완성에 들어가면 아예 오버라이딩 하라고 맨위에 나온다
	
	// 상속받은 추상 클래스의 추상 메소드 오버라이딩
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}