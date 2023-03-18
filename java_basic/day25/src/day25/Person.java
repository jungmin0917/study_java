package day25;

public class Person {
	private String name;
	private int age;
	
	// 기본 생성자
	public Person() {
		this("noname", 0);
	}
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "name : " + name + ", age = " + age;
	}
	
	
}
