package work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserMain {
	public static void main(String[] args) {
		// 유저 아이디와 패스워드 담을 수 있는 UserInfo 클래스 만들고,
		// main 클래스에서 유저의 아이디와 비밀번호를 키보드에서 입력받아 객체에 저장하고
		// ArrayList에 추가하여 출력하기
		
		// 결과
		
		// 아이디 생성 : aaa
		// 패스워드 생성 : 1234
		
		// aaa
		// 1234
		// -----------------

		// 아이디 생성 : bbb
		// 패스워드 생성 : 5678

		// aaa
		// 1234
		// ------
		// bbb
		// 5678
		// -----------------
		
		// 3개 입력받으면 종료하기
		
		List<UserInfo> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String id;
		String pw;
		
		while(true) {
			try {
				if(list.size() >= 3) {
					System.out.println("프로그램 종료");
					break;
				}
				
				System.out.print("아이디를 입력하세요 : ");
				id = br.readLine();
				
				// 아이디 중복검사
				if(duplicate(list, id)) {
					continue;
				}
				
				System.out.print("비밀번호를 입력하세요 : ");
				pw = br.readLine();
				
				UserInfo ui = new UserInfo(id, pw);
				
				list.add(ui);
				
				for (UserInfo userinfo : list) {
					System.out.println("-----");
					System.out.println(userinfo.getId());
					System.out.println(userinfo.getPw());

				}
				
				System.out.println("-------------------");
				
				
			} catch (IOException e) {
				System.out.println("입력 오류");
			}
		}
		
	}

	private static boolean duplicate(List<UserInfo> list, String id) {
		boolean duplication = false;
		
		for (UserInfo v : list) {
			if(v.getId().equals(id)) {
				System.out.println("중복된 아이디입니다");
				duplication = true;
			}
		}
		
		return duplication;
	}
}









