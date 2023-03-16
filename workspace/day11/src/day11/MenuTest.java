package day11;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		outerwhile: // 자바에서는 두 단계 상위 break가 존재하지 않고, 이와 같이 반복문에 레이블을 붙여 특정 반복문을 빠져나오는 식으로 써야 한다
		while(true) {
//			예를 들어 이럴 때 쓴다. 메뉴를 최초 1번은 보여줘야 할 때
			do {
				System.out.println("============================================");
				System.out.println("1.save  2.view  3. modify  4. delete  5.exit");
				System.out.println("============================================");
				System.out.print("select the menu : ");
//				int menu = sc.nextInt(); // 이렇게 지역변수로 선언하면 해당 블록을 벗어나면 사용할 수 없음
				try { // 일종의 유효성 검사 진행
					menu = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("input 1 ~ 5 numbers");
					menu = 0;
					sc.nextLine(); // 이전 버퍼에 남아있는 값 (특히 \n) 제거
				}

				// 여기에 도달했다는 것은 메뉴를 제대로 골랐다는 뜻
				switch(menu) {
					case 1:
						System.out.println("save");
						break;
					case 2:
						System.out.println("view");
						break;
					case 3:
						System.out.println("modify");
						break;
					case 4:
						System.out.println("delete");
						break;
					case 5:
						System.out.println("exit");
						break;
					default:
						System.out.println("program exit");
						System.exit(0); // 프로그램 강제 종료
						break outerwhile;
//						break;
				}
			} while (menu < 1 || menu > 5); // 메뉴를 잘못 고른다면 계속 실행하게 하기
		}
		
		sc.close();
	}
}
