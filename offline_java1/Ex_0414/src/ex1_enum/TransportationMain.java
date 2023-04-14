package ex1_enum;

public class TransportationMain {
	public static void main(String[] args) {
//		values() : 열거형 상수 안에 들어 있는 내용들을 enum 타입의 배열로 반환
		Transportation[] trans = Transportation.values();
		
		for(Transportation transport : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n", transport.name(), transport.totalFare(100));
		}
	}
}
