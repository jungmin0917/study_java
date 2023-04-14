package ex1_enum;

public enum Item {
	START("시작", 0), STOP("멈춤", 1), EXIT("종료", 2);
	
	private String itemStr;
	private int sign;
	
	// 각 열거형 객체는 이 생성자를 통해서 itemStr을 설정한다
	private Item(String str, int sign) {
		this.itemStr = str;
		this.sign = sign;
	}
	
	public String getItemStr() {
		return this.itemStr;
	}
	
	public int getSign() {
		return this.sign;
	}
	
} 
