package ex1_first;

import java.util.*;
import java.util.Scanner;

public class Ex1_first {
	public static void main(String[] args) {
//		출력 기능이 있는 함수
		System.out.println("Hello world!");
		
		// 한 줄 주석
		
		/**
		 * 여러 줄 주석
		 * 여러 줄 주석
		 */
		
		System.out.println(100 + 50);
		
		System.out.println("안녕하세요");
		
		// 문자열 뒤에 더해지는 숫자는 문자열 뒤에 붙는다
		System.out.println("안녕하세요" + 10 + 20);
		
		System.out.println(10 + 20 + "안녕하세요");
		
		// 자바에서는 "" 안에 있으면 모두 문자열로 인식한다
		
		// 위에서 아래, 좌에서 우로 코드의 흐름이 간다

		System.out.println("2 + 2 = " + 2 + 2); // 22
		System.out.println("2 + 2 = " + (2 + 2)); // 4
		// 연산자 우선순위 차이로 결과가 달라짐
		
		
	}
}
