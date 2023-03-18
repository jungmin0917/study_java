package day29;

// 부모 클래스
public class Parent {
//	private String name;
//	private boolean gender;
	
	protected String name;
	protected boolean gender;
	
	// 기본 생성자
	public Parent() {
		this("noname", false);
	}

	// 생성자
	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		String sex = this.gender ? "male" : "female";
		String str = String.format("%s(%s)", this.name, sex);

		return str;
	}
	
}
