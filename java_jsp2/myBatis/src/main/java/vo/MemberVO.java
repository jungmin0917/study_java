package vo;

// TABLE_MEMBER 테이블에 어떤 컬럼이 있는지 적어 놓음
// ID VARCHAR2(500) PRIMARY KEY,
// PW VARCHAR2(500),
// NAME VARCHAR2(500),
// AGE NUMBER(3)

// VO 모델 객체 세팅
public class MemberVO {
	// 먼저 사용할 필드(멤버변수)를 선언해주자
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 기본 생성자
	public MemberVO() {;}

	// getter, setter 설정
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

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
	
	
}
