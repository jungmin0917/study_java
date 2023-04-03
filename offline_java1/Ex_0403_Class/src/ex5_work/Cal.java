package ex5_work;

public class Cal {
	private int a;
	private int b;
	
	// 기본 생성자
	public Cal() {;}

	// getter, setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public double calc(int a, char op, int b) {
		double res = 0;
		
		switch(op) {
			case '+':
				res = a + b;
				break;
			case '-':
				res = a - b;
				break;
			case '*':
				res = a * b;
				break;
			case '/':
				res = (double)a / b;
				break;
			default:
				break;
		}
		
		return res;
	}
	
}
