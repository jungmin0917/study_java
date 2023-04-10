package ex5_car;

public class CarMain {
	public static void main(String[] args) {
		// Car 클래스를 생성. 그 클래스는 gasGauge 라는 변수를 갖고 있다.
		// 생성자를 통해 외부에서 gasGuage를 받는다.
		// 잔여량을 출력하는 메서드인 showCurrentGuage() 를 갖고 있다.
		
		// HybridCar 클래스는 electricGauge 변수를 갖고 있고, Car 클래스를 상속받는다
		// 생성자를 통해 외부에서 gasGuage와 electricGauge를 받는다.
		// 메서드는 오버라이딩하여 잔여 가스량과 전기량을 출력하기
		
		// HybridWaterCar 클래스는 waterGauge 변수를 갖고 있고, HybridCar 클래스를 상속받는다
		// 생성자를 통해 외부에서 gasGuage와 electricGauge와 waterGauge를 받는다.
		// 메서드는 오버라이딩하여 잔여 가스량과 전기량, 물의 양을 출력하기
		
		// main에서 HybridWaterCar 객체를 생성하여 잔여량을 출력하기
		// 잔여 가스량
		// 잔여 전기량
		// 잔여 물 양
		
		HybridWaterCar hwc = new HybridWaterCar(10, 20, 30);
		
		System.out.println(hwc.showCurrentGuage());
	}
}
