package ex6_interface;

// 하나의 클래스가 여러 인터페이스를 상속받을 수 있다
public class Kitchen implements Menu1{ // Menu1이 2, 3을 상속받았기 때문에 1만 상속받아도 된다.
	
	@Override
	public String jajang() {
		return "계란 + 춘장 + 쌀";
	}
	
	@Override
	public String tangsuyook() {
		// TODO Auto-generated method stub
		return "돼지고기 + 양념 + 양파";
	}
	
	@Override
	public String bokkeumbab() {
		// TODO Auto-generated method stub
		return "중면 + 춘장 + 완두콩";
	}
	
	@Override
	public String jambbong() {
		return "중면 + 홍합 + 청경채";
	}
}
