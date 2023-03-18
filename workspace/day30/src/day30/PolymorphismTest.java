package day30;

import java.util.Scanner;

// 다형성이란, 하나의 메소드가 서로 다른 클래스에서 다양한 방법으로 사용되는 것을 말한다
// 다형성을 구현할 메소드를 포함한 클래스는 반드시 같은 부모 클래스를 가져야 한다.
// 오버라이딩(overriding) : 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것
// 오버로딩(overloading) : 메소드명은 동일하나 매개변수 개수, 자료형, 순서 등이 다른 메소드를 여러 개 정의하는 것

// 추상 클래스를 상속받으면 자식 클래스에서는 반드시 부모 클래스의 추상 메소드를 오버라이딩하여 사용하여야 한다
// 실행할 때는, 부모 클래스의 객체에 자식 클래스의 객체를 대입해서 실행해야 한다.

abstract class Shape {
	public abstract void draw(); // 추상 메소드 (다형성을 구현할 메소드)
	// {} 블록을 body 라고 한다
}

// 똑같은 draw() 메소드를 다양한 클래스에서 정의하여 다양한 방법으로 쓰려고 하는 것이 지금 하는 일이다

class Point extends Shape{
	// 상속받은 추상 메소드 오버라이딩
	@Override
	public void draw() {
		System.out.println("dot the point");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("draw the line");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw the circle");
	}
}

class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw the rectangle");
	}
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw the triangle");
	}
}

// 위와 같이 다양한 draw() 메소드를 구현하였다.
// 위에서 보듯이 모두 같은 부모 (Shape) 클래스에서 상속받은 draw() 메소드를 재정의(오버라이딩)하였다.


public class PolymorphismTest {
	
	public static void main(String[] args) {
//		Shape shape = new Shape(); // Shape 클래스 자체는 추상 클래스이기 때문에 그냥 객체를 생성할 수 없다
		
//		부모 클래스의 객체를 생성하는 대신, 부모 클래스를 상속받은 자식 클래스를 생성하여 draw 메소드를 써보자
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rectangle(), new Triangle()};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("select the menu");
		int menu = sc.nextInt();
		
		shapes[menu-1].draw();
	}
}
