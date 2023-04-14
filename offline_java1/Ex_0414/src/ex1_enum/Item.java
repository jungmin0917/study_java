package ex1_enum;

public enum Item {
	START("����", 0), STOP("����", 1), EXIT("����", 2);
	
	private String itemStr;
	private int sign;
	
	// �� ������ ��ü�� �� �����ڸ� ���ؼ� itemStr�� �����Ѵ�
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
