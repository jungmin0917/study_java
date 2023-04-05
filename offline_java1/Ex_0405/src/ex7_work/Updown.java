package ex7_work;

import java.util.Random;

public class Updown {
	private int num;
	private int count = 0;

	// 기본 생성자
	public Updown() {
		Random rand = new Random();
		
		this.num = rand.nextInt(1, 50);
	}
	
	// getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String UpdownGame(int n) {
		this.count++;
		
		if(n == this.num) {
			return "Right";
		}else if(n > this.num) {
			return "Down";
		}else {
			return "Up";
		}
	}
}
