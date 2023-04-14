package ex1_enum;

public class TransportationMain {
	public static void main(String[] args) {
//		values() : ������ ��� �ȿ� ��� �ִ� ������� enum Ÿ���� �迭�� ��ȯ
		Transportation[] trans = Transportation.values();
		
		for(Transportation transport : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n", transport.name(), transport.totalFare(100));
		}
	}
}
