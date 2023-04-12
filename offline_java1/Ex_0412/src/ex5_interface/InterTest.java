package ex5_interface;

// 인터페이스 선언
public interface InterTest {
	
	// 인터페이스에는 상수와 추상 메서드 이외에는 아무것도 들어갈 수 없다.
	int NUM = 100; // 재대입 불가, 상수명은 반드시 대문자로 하기
	// 자동으로 앞에 public static final 붙음
	
	int getNum(); // 추상 메서드. (자동으로 앞에 public abstract 붙음)
	
	// 변수 앞에는 public static final이,
	// 메소드 앞에는 public abstract가 자동으로 붙는다.
}
