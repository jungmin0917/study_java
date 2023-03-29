package ex7_Scanner;

import java.util.Scanner; // 필요한 라이브러리를 임포트해야 한다

public class Ex1_Scanner {
	public static void main(String[] args) {
//		Scanner : 사용자로부터 입력을 받는 클래스 (java.util 하위에 있음)
//		다양한 입력 소스에서 데이터를 읽어들이기 위한 클래스이다
//		보통 인수로 System.in을 쓰고, 이것은 표준 입력 스트림으로, 사용자가 키보드로 입력한 데이터를 읽어들임
//		System.in 뿐 아니라 파일에서도 읽을 수 있고 여러 입력 방식이 있다.
		
		try {
			Scanner sc = new Scanner(System.in); // 표준 입력 스트림 Scanner 객체를 생성함
			
//			Scanner 클래스엔 다양한 메소드가 있다.
//			next(), nextLine(), nextInt(), nextDouble() 메소드가 많이 쓰인다.
			
			System.out.print("정수를 입력해주세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("입력하신 정수는 %d입니다\n", num);

			System.out.print("이름을 입력해주세요 : ");
			String name = sc.nextLine();
			
			System.out.printf("입력하신 이름은 %s입니다\n", name);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("제대로 입력해주세요");
		}
	}
}
