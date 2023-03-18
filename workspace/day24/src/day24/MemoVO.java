package day24;

import java.text.SimpleDateFormat;
import java.util.Date; // 요즘은 이거 잘 안 쓰고 java.time 패키지를 사용함

public class MemoVO {
	
//	멤버 변수의 종류는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있다.
//	인스턴스 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 독립된 기억 공간을 가지지만, 
//	정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.
	public static int count;
	private int no;				// 객체가 생성될 때마다 자동으로 1씩 증가
	private String name;		
	private boolean gender;
	private String memo;
	private Date writeDate;		// 객체가 생성되는 순간의 날짜와 시간
	
	public MemoVO() {
		this("무명씨", false, "없음");
	}
	
	public MemoVO(String name, boolean gender, String memo) {
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	
//	private 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할 수 없다.
//	다만, 이 규칙에 대한 예외 지정을 getter, setter 메소드를 사용하여 적용할 수 있다.
//	이런 public 메소드를 만들어서 간접적으로 접근할 수 있게 하는 일종의 편법이다.
//	여기서 getter, setter는 일종의 별칭이며 딱히 특별한 메소드가 있는 게 아니다
	
//	getter는 값을 읽을 때 쓰고, setter는 값을 변경할 때 쓴다.
//	아래와 같은 메소드는 일종의 getter라고 볼 수 있다.
//	public String getName() {
//		return name;
//	}
	
//	아래와 같은 메소드는 일종의 setter라고 볼 수 있다.
//	public void setName(String name) {
//		this.name = name;
//	}
	
//	그런데 예외가 많게 되면 위와 같은 걸 길게 써야 한다.
//	getter는 private 권한을 가지는 멤버 변수의 값을 읽을 때 사용한다.
//	setter는 private 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.
//	그래서 이걸 또 편하게 하는 기능이 eclipse에 있다.
	
//	Alt + Shift + S로 Source창을 켜고, Generate Getters and Setters를 누른다.
//	그럼 자기가 원하는 것만 선택해서 getter, setter을 전부 지정할 수 있다!

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MemoVO.count = count;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		return no + ". " + name + "(" + (gender?"남자":"여자") + ")님이 " + sdf.format(writeDate) + "에 남긴 말 : " + memo;
	}
	
}
