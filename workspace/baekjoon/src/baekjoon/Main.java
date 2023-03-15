package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			
			if(input.isEmpty()) {
				break;
			}
			
			String[] array = input.split(" ");

			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			
			result += (a + b) + "\n";
		}
		
		sc.close();
		
		System.out.println(result);
	}
}
