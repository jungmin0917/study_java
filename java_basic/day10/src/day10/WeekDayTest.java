package day10;

import java.util.Scanner;

public class WeekDayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input the year, month, day : ");
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
//		1년 1월 1일의 요일을 알 때 기준으로 구하려는 짓인가?
//		서기 1년 1월 1일은 월요일이라고 한다
//		1년 1월 1일부터 입력한 년도의 전년도 12월 31일까지 지난 날짜를 계산한다
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400; // 윤년의 날수를 더한다
//		위와 같이 하는 이유는, 4로 나눈 것을 윤년으로 해서 해당하는 연수만큼 더함. 그리고 100으로 나눈 것을 윤년으로 해서 다시 뺌. 그리고 다시 400으로 해서 더함. 이러면 윤년인 년도의 날짜만 더해진다.
		
		int[] m_array = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31};
		
//		전년도 12월 31일까지 지난 날짜 수에 올해 전 달까지의 날짜를 더한다
		for (int i = 0; i < m_array.length; i++) {
			if(i == 1) {
				if(year % 4 == 0 && (year % 100 != 0 && year % 400 == 0)) {
					sum += m_array[i] + 1;
				}else {
					sum += m_array[i];
				}
			}else {
				sum += m_array[i];
			}
//			switch(i) {
//				case 4:
//				case 6:
//				case 9:
//				case 11:
//					sum += 30;
//					break;
//				case 2:
//					// 올해가 윤년이면 29일, 아니면 28일을 더
//					if(year % 4 == 0 && (year % 100 != 0 && year % 400 == 0)) {
//						sum += 29;
//					}else {
//						sum += 28;
//					}
//					break;
//				default:
//					sum += 31;
//					break;
//			}
		}
		
//		이번 달까지 지난 날수를 구한다
		sum += day - 1;

		int yoil = sum % 7;
		
//		0이면 월요일 (월요일이 1년 1월 1일이므로), 1이면 화요일, 2이면 수요일, ...
		String[] array = new String[] {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
		
		System.out.println(array[yoil]);
		
//		Date 클래스는 더이상 사용하지 않으며, java.time 패키지를 사용한다. (시간 조작에)
	}
}
