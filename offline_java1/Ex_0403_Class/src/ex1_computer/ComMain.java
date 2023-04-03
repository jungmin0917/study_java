package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		
		// 해당 클래스로 객체(인스턴스) 생성 (객체화)
		Computer com1 = new Computer();

		// 다른 클래스의 변수 호출
		System.out.println(com1.getSsd());
		System.out.println(com1.getRam());
		System.out.println(com1.getCpu());
		System.out.println(com1.getColor());
		System.out.println("---------------------");

		System.out.println();
		
		// 이렇게 명시적 객체 생성을 하면 Heap 쪽에 각 다른 주소에 저장되므로 내 객체의 값을 변경해도 남의 객체엔 영향이 없다
		Computer com2 = new Computer(); // new -> 명시적 객체 생성	
		
		com2.setSsd(512);
		com2.setRam(32);
		com2.setCpu(5.2);
		com2.setColor("black");
		
		// 기존의 반복 작업을 함수로 처리함
		com2.getInfo();
		
		
	}
}
