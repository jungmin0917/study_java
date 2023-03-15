package baekjoon;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = IntStream.rangeClosed(1, n).sum();
		
		result = sum + "";
		
		System.out.println(result);
	}
}