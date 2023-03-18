package day04;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input the string : ");
		
		String str = sc.nextLine();
		
//		length() : 변수에 저장된 문자열을 구성하는 문자의 개수를 얻어온다
		System.out.println("string's length = " + str.length());
		
//		trim() : 문자열 앞뒤의 불필요한 공백을 제거하는 메소드
		System.out.println("string's trimmed length = " + str.trim().length());
		
//		toUpperCase(), toLowerCase() : 대문자로, 소문자로 바꿔주는 메소드
		
		System.out.println("uppered string : " + str.toUpperCase());
		System.out.println("lowered string : " + str.toLowerCase());
		
//		charAt() : n번째 문자를 가져오는 메소드 (인덱스는 0번부터임)
		
		try {
			System.out.println("nth char : " + str.charAt(2));
		}catch(Exception e) {
			System.out.println("exception : " + e.getMessage());
		}
		
		sc.close();
	}
}