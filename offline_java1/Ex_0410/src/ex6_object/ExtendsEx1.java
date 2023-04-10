package ex6_object;

public class ExtendsEx1 {
	// 현재 클래스의 변수나 메서드가 어떨 때는 String을 받고,
	// 어떨 때는 int를 받는 등, 상황에 따라 자료형을 받아야 하는 경우,
	// 변수의 자료형이나, 메서드의 파라미터에 어떤 자료형을 선언할지 고민될 때가 있다.
	
	// 모든 자료형을 전부 getter, setter로 써주기에는 너무 코드가 길어진다
	
	Object value; // 자바 최상위 객체인 Object형으로 변수를 생성

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
