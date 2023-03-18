package day17;

// 달력을 출력하는 메인 클래스
public class MyCalendar {
	public static void main(String[] args) {
		System.out.println(MyCalen.isLeapYear(2023));
		
		System.out.println(MyCalen.lastDay(2023, 2));
		
		System.out.println(MyCalen.totalDay(2023, 3, 16));
		
		System.out.println(MyCalen.weekDay(2023, 3, 16));
	}
}
