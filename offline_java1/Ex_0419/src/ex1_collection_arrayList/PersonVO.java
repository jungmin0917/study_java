package ex1_collection_arrayList;

public class PersonVO {
	private String name;
	private int age;
	
	// 기본 생성자
	public PersonVO() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + "]";
	}
}
