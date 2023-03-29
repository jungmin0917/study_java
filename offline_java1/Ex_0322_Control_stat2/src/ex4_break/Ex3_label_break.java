package ex4_break;

public class Ex3_label_break {
	public static void main(String[] args) {
//		label : 특정 반복문에 이름표를 붙여 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		
//		label은 항상 쌍으로 존재한다.
//		label의 이름은 자기가 원하는 대로 사용이 가능하다.
//		label은 자신을 포함하고 있는 상위 개념에게만 달 수 있다.
		
//		switch문이나 반복문 앞에 붙일 수 있음
		
//		라벨명: 반복문 또는 switch문
		for1: for (int i = 1; i <= 3; i++) { // for1이라는 라벨을 붙임
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
//				break for1; // 이런 식으로 상위의 반복문을 빠져나갈 수 있다.
			}
			
			for (int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					break for1;
				}
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
