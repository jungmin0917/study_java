package ex5_work;

public class TimesTable {
	private int Num;

	// 기본 생성자
	public TimesTable() {;}

	// getter, setter
	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}
	
	// 구구단 출력 메소드
	public void showTable() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 9; i++) {
			String str = String.format("%d * %d = %d", Num, i, Num * i);
			
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}
