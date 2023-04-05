package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		
		Ex1_Overload ol = new Ex1_Overload();
		
		ol.result();
	
		ol.result(1);
		
		ol.result('C');
		
		ol.result("test", 10);
		
		ol.result(10, "test");
		
		// 예를 들어 println에 여러 자료형이 들어가지 않나.
		// 그 함수에도 아주 다양한 오버로딩이 되어있다.
		
		System.out.println(100);
		System.out.println("100");
		System.out.println('A');
		System.out.println(3.14);
	}
}
