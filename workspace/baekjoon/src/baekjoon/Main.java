package baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		result = (a > b) ? ">" : (a < b ? "<" : "==");
		
		sc.close();
		
		System.out.println(result);
	}
}