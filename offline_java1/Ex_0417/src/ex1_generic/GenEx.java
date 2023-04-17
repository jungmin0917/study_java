package ex1_generic;

public class GenEx<T> {
	// 제네릭(Generic)
	// 일반적인 코드를 작성하고, 이 코드를 다양한 타입의 객체에 대해 재사용하는 객체지향 기법
	// 객체의 타입을 컴파일할 때 체크하기 때문에, 타입에 대해 안정성을 높이고 형변환을 해야 하는 번거로움을 줄일 수 있다
	
	// 클래스에 사용할 경우
	// public class 클래스명<제네릭타입>{}
	
	// 인터페이스에 사용할 경우
	// public interface 인터페이스명<제네릭타입>{}
	
	// T를 타입변수(Type variable)이라고 한다.
	// E(Element), K(Key), V(Value)를 사용하기도 한다.

	T value; // 아직 타입을 정하지 않은 것이다

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
