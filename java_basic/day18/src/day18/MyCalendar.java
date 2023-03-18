package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 달력을 출력하는 메인 클래스
public class MyCalendar {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("input the year, month : ");

		String input = br.readLine();
		
		StringTokenizer sc = new StringTokenizer(input);
		
		int year = Integer.parseInt(sc.nextToken());
		int month = Integer.parseInt(sc.nextToken());
		
		// 달력을 출력할 년, 월을 입력하면 해당 달의 달력 표시해주기

		System.out.println("=============================");
		System.out.printf("           %4d %02d           \n", year, month);
		System.out.println("=============================");
		System.out.println(" SUN MON TUE WED TUE FRI SAT ");
		
		// 1일부터 달력을 출력할 달의 마지막 날짜만큼 반복하며 날짜를 출력한다
		// 해당 달의 1일의 요일을 알아내서 나머지는 그 다음부터 띄어쓰기를 해주면 된다
		
		// 첫 날의 요일을 구해서 그 날 전만큼 띄어쓰기를 해준다
		int first_yoil = MyCalen.weekDay(year, month, 1);
		
		String blank = "    ".repeat(first_yoil);
		System.out.print(blank);
		
		int last_day = MyCalen.lastDay(year, month);
		
		for(int i=1; i <= last_day; i++) {
			
			System.out.printf(" %2d ", i);
			
			// 출력한 날짜가 토요일이면 줄을 바꾼다
			if(MyCalen.weekDay(year, month, i) == 6) {
				System.out.println();
			}
		}
		
		if(MyCalen.weekDay(year, month, last_day) != 6) {
			System.out.println();
		}
		System.out.println("=============================");
		
	}
}
