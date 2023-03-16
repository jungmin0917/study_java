package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JuminCheck {
	public static void main(String[] args) throws IOException{

		// 주민등록번호 유효성 검사 프로그램 만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("input the jumin number : ");
		
		String juminNo = br.readLine();
		
//		주민등록번호 : 	8	3	0	4	2	2	1	1	8	5	6	0	0
//					*	*	*	*	*	*	*	*	*	*	*	*
//		가중치 : 		2	3	4	5	6	7	8	9	2	3	4	5
//					=	=	=	=	=	=	=	=	=	=	=	=
//					16	9	0	20	12	14	8	9	16	15	24	0 = 143
		
//		위처럼 주민등록번호에 가중치를 넣어 계산하면 특정 값이 나온다.
//		143 % 11 =  0		11 	- 0 = 11 -> 1의 자리만 취한다 (1)
//					1			- 1 = 10 -> 1의 자리만 취한다 (0)
//					2			- 2 = 9
//					10			- 10= 1
//		계산값을 11로 나눈 나머지를 11에서 뺀 값이 맨 마지막 번호와 같으면 정상적인 주민등록번호이다
		
		int sum = 0; // 계산값
		int[] weights = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		for (int i = 0; i < 12; i++) {
			int n = juminNo.charAt(i) - 48;
			
//			sum += n * weights[i];
			sum += n * (i % 8 + 2);
		}
		
		int rem = sum % 11;
		int checksum = (11 - rem) % 10;
		
		int jumin_checksum = juminNo.charAt(12) - 48;
		
		if(jumin_checksum == checksum) {
			System.out.println("this is correct");
		}else {
			System.out.println("this is wrong");
		}
	}
}
