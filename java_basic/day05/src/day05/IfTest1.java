package day05;

import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input the three score : ");
		
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
//		double avg = total / 3.0; // 정수와 정수 나눗셈은 정수가 나오므로 둘 중 하나라도 실수로 바꿔줘야 함
//		또는 아래와 같이 형변환(casting)해줄 수 있음

//		double avg = (double)(total / 3); // 이건 정수와 정수를 이미 계산한 후 double로 했으니 의미가 없음
		double avg = (double)total / 3;
		
//		System.out.println("average score : " + avg);
//		System.out.printf("average score : %f", avg);
		System.out.printf("average score : %6.2f\n", avg); // 전체 자리수를 6자리, 소수점 아래 자리수를 2자리로 하여 출력
//		System.out.printf("average score : %.15f", avg); // 최대 정밀도 15자리까지 해보기 (근데 정밀도가 앞에 숫자까지 포함이므로 앞에 부분이 커지면 뒤에가 정확하지가 않게 됨)
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else if(avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}
}