package ex5_pen;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		
		Pen p2 = new Pen(10000, "gold");
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
