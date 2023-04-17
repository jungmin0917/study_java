package ex2_generic;

// ���׸��� �� �� �̻��� ��ƼŸ�� �Ķ���͸� ����� �� �ִ�.
public class Person<T, M> {
	private T name;
	private M age;
	
	// ������
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
