package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UpdownMain {
	// UpDown 클래스를 생성하여 1 ~ 50 사이의 난수를 발생시킨다.
	// Main 클래스에서는, 사용자가 키보드로 정수를 입력받는다.
	// 입력받은 정수를 UpDown 클래스에서 숫자를 판단하여 발생한 난수보다 크면 Down, 작으면 Up을 출력한다.
	// 사용자가 맞힐 때까지 계속된다.
	// 정답을 맞힌 경우 프로그램의 종료는 메인 클래스에서 이뤄지도록 한다.
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			Updown ud = new Updown();
			
			String res = "";
			
			while(true) {
				System.out.print("1 ~ 50 사이의 정수를 입력하세요 : ");
				
				int n = Integer.parseInt(br.readLine());

				res = ud.UpdownGame(n);
				
				if(res.equals("Right")){
					res = "정답입니다!\n" + ud.getCount() + "회 만에 맞추셨습니다";
					break;
				}
				
				System.out.println(res);
			}
			
			bw.write(res);
			
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
