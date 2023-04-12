package ex3_ramen;

public class CheeseRamen extends Ramen{
	
	String cheese = "ДЎБо";
	
	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n", nuddle, soup, cheese);
	}
}
