package ex5_pen;

public class Pen {
	private int price;
	private String brand = "monami";
	private String color;
	
	// �⺻������ �����ش� (�����ؼ��� � ������ �� �͵�)
	public Pen() {
		this.price = 1000;
		this.brand = "monami";
		this.color = "white";
	}
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}
}
