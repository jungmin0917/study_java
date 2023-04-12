package ex1_abstract;

// 추상 메서드를 하나라도 포함했으므로 추상클래스로 선언해줘야 한다 (abstract 키워드)
abstract public class AbsParent {
	int value = 100;

	// 일반 메서드
	public int getValue() {
		return value;
	}
	
	// 추상 메서드는 중괄호 부분(body)가 없기 때문에 미완성적이다.
//	public void setValue(int n); // 추상 메서드
	
	// 추상 메서드는 앞에 추상 메서드임을 표시하는 키워드 abstract를 적어주어야 한다.
	abstract public void setValue(int n);
	
	// 그러므로 자식 클래스가 이것을 상속받아서 반드시 해당 추상 메소드를 구현해서 써야 한다.
}
