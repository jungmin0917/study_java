package ex5_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimesTableMain {
	// TimesTable 클래스를 만들고, showTable() 메소드를 정의한다
	// showTable() 메소드에는 구구단을 출력하는 코드를 작성한다
	// TimesTableMain에서는 TimesTable 객체를 생성하고, 구구단에 사용할 값을 입력받고 구구단을 출력한다
	
	public static void main(String[] args) {
		
		try {
			TimesTable tt = new TimesTable();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("1 ~ 1000000 사이의 정수를 입력해주세요");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n < 1 || n > 1000000) {
				throw new Exception("1 ~ 1000000 사이의 정수로 입력해주세요");
			}
			
			tt.setNum(n);
			
			tt.showTable();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
