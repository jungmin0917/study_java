package com.jspex.beans;

// VO는 Value Object 모델 객체로서, 데이터를 저장하기 위한 용도로 사용됨
// 데이터를 보호하고 불변성을 유지하기 위한 용도로 사용됨

// DB에 있는 컬럼의 갯수만큼, 데이터타입도 일치하게끔 변수를 만들어야 한다.
public class MemberVO { // DB에서 가져온 결과값을 담을 객체
	// 반드시 private으로 해주자 (VO이면서 자바빈즈 써야 되니까)
	private int num;
	private String name;
	private String birthday;
	
	// 기본 생성자
	public MemberVO() {};
	
	// getter, setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	// 이제 우리가 DB에 접근을 해야 하는데, 연결을 매번 할 수 없으니, connector(연결하는 코드)를 메소드로 만들어두자.
}
