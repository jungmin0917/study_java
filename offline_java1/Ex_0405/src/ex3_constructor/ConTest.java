package ex3_constructor;

public class ConTest {
	// 이번엔 생성자에 대해 알아보자
	
//	생성자 : 객체가 생성될 때 메모리 할당을 위해 호출되는 영역
//	생성자는 객체가 생성될 때 처음 한 번만 자동으로 호출된다.
	
//	ex) ConTest ct = new ConTest(); // 여기서 new 뒤에 있는 게 생성자이다. (객체를 생성함)
	
//	생성자의 특징
//	클래스와 이름이 똑같아야 한다
//	반환형이 없다.
	
	// 생성자 정의.
	// 객체 생성 시 한 번만 자동으로 호출되므로, 여기에 초기값을 지정하거나, 객체 생성하면서 해야 할 일을 적어놓으면 된다.
	public ConTest() {
		System.out.println("생성자 호출");
	}
	
	// 생성자도 오버로딩이 가능하다
	public ConTest(String name) {
		System.out.println(name + "으로 초기화됨");
	}
	
}
