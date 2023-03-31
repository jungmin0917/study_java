package ex2_String_method;

import java.util.Arrays;

public class Ex1_String_method {
	public static void main(String[] args) {
//		몇 가지 String 클래스의 유용한 메소드에 대해 알아보자
		
//		객체 생성 기본
//		클래스명 객체명 = new 클래스명();
		
//		해당 클래스의 메소드 호출 : 객체명.메소드명()
		
		String str = "Jung Min";
		System.out.println("str의 길이 : " + str.length());
		
		System.out.println("문자열의 해당 문자 index의 위치 : " + str.indexOf("M"));
		System.out.println("문자열의 해당 문자 index의 위치 : " + str.indexOf("a"));
		// indexOf 는 없으면 -1을 반환, 있으면 해당 위치를 반환함
		
		System.out.println("문자열의 index 위치의 문자 : " + str.charAt(5));
		// charAt은 해당 인덱스의 문자를 반환함	
		
		System.out.println("원하는 문자열 추출하기 : " + str.substring(4));
		System.out.println("원하는 문자열 추출하기 : " + str.substring(4, 6));
		// substring은 원하는 부분의 문자열을 추출한다.
		// 오버로딩에 의해 매개변수가 1개인 거랑 2개인 거랑 다름
		
		System.out.println("문자열 자르기 : " + Arrays.toString(str.split(" ")));
		// split()은 delimiter (구분자)로 구분하여 배열로 반환한다
		
		String number = "100";
		// 숫자가 담겨 있는 문자열을 정수형으로 바꾸는 법
		
		int n = Integer.parseInt(number);
		// Integer 클래스의 parseInt 메소드를 이용한다.
		System.out.println(n);
		
		String s = Integer.toString(n);
		System.out.println(s + 10);
	}
}
