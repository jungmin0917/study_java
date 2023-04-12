package ex2_abstract;


public class AbsMain {
	public static void main(String[] args) {
		AbsChild1 ac1 = new AbsChild1();
		AbsChild2 ac2 = new AbsChild2();
		
		System.out.println(ac1.changeValue());
		System.out.println(ac2.changeValue());
	}
}
