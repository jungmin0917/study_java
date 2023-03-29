package ex4_break;

public class Ex1_break {
	public static void main(String[] args) {
		
//		break는 반복문 내에서만 사용이 된다.
//		break를 만나면 가장 가까이 있는 반복문을 빠져나간다.
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j % 2 == 0) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
