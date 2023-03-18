package day17;

// 달력 작업에 사용할 메소드를 작성할 클래스
public class MyCalen {

//	인수로 년도를 넘겨받아 윤년, 평년을 판단해서 윤년이면 true, 평년이면 false를 리턴하는 메소드 만들기
	
	public static boolean isLeapYear(int year) { // 인수는 연도(정수)를 입력받음
		boolean isLeap;
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			isLeap = true;
		}else {
			isLeap = false;
		}
		
		return isLeap;
	}
	
//	인수로 년, 월을 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		int[] m_arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		m_arr[1] = isLeapYear(year) ? 29 : 28;
		
		return m_arr[month - 1];
	}
	
//	인수로 년, 월, 일을 넘겨받아 1년 1월 1일부터 지나온 날짜의 합계를 계산해 리턴하는 메소드
	
	public static int totalDay(int year, int month, int day) {
		int sum = 0;

		// 지난 연도까지 더하기
		sum += (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		
		// 지난 달까지 더하기
		for (int i = 1; i < month; i++) {
			sum += lastDay(year, i);
		}
		
		// 이번달 오늘까지 더하기
		sum += day;
		
		return sum;
	}
	
//	인수로 년, 월, 일을 넘겨받아 요일을 숫자로 리턴하는 메소드
//	일요일(0), 월요일(1), 화요일(2), ... 토요일(6)
//	1년 1월 1일이 월요일로 시작하므로.
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}
	
}