package ex4_person;

public class Person {
	private String name;
	private int age;
	private String tel;
	
	// �⺻ ������
	public Person() {;}
	
//	public void setAge(int age) {
//		age = age; // �̷��� ������ �Ű������� age�� �̸��� ��ġ�� ������,
//		this.age = age; // �̷��� �ش� �ν��Ͻ��� age�� �ҷ������ν� ������ ��ġ�� ���� ����
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
