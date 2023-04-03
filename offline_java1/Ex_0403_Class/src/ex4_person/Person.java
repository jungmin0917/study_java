package ex4_person;

public class Person {
	private String name;
	private int age;
	private String tel;
	
	// 기본 생성자
	public Person() {;}
	
//	public void setAge(int age) {
//		age = age; // 이렇게 적으면 매개변수의 age와 이름이 겹치기 때문에,
//		this.age = age; // 이렇게 해당 인스턴스의 age를 불러옴으로써 변수가 겹치는 것을 방지
//	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
}
