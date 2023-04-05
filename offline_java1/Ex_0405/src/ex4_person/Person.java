package ex4_person;

public class Person {
	private String name;
	private int age;
	private String tel;
	
	// 기본 생성자
//	public Person() {;}
	
	// 무조건 세 데이터 받아서 생성하게 하기
	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
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
