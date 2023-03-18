package day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			int age = 0;
			System.out.print("나이를 입력해주세요 : ");
			age = sc.nextInt();
//			문자열을 제외한 데이터를 입력받은 후 nextLine() 메소드가 실행이 되어야 한다면, 키보드 버퍼의 엔터키를 읽어들이는 문제가 발생한다.
//			이럴 때는 문자열을 제외한 데이터를 입력받은 후, 키보드 버퍼를 비워주는 동작을 실행하고 다음 입력을 받아야 한다.
			
			sc.nextLine(); // 키보드 버퍼를 비운다.
			
			String name = "";
			System.out.print("이름을 입력해주세요 : ");
			name = sc.nextLine();
			
			System.out.printf("%s 님은 %d살입니다", name, age);
			
			
			
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		}
	}
}
