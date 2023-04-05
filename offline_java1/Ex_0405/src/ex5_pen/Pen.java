package ex5_pen;

public class Pen {
	private int price;
	private String brand = "monami";
	private String color;
	
	// 기본값들을 정해준다 (웬만해서는 어떤 값으로 할 것들)
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
