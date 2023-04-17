package ex2_generic;

// 제네릭은 두 개 이상의 멀티타입 파라미터를 사용할 수 있다.
public class Person<T, M> {
	private T name;
	private M age;
	
	// 생성자
	public Person(T name, M age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public M getAge() {
		return age;
	}

	public void setAge(M age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
