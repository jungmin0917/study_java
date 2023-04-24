package work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01_work {
	public static void main(String[] args) {
		// 아이디 생성 : abc
		// abc 출력
		
		// 아이디 생성 : abc2
		// abc abc2 출력
		
		// 아이디 생성 : abc3
		// abc abc2 abc3 출력
		
		// 아이디 생성 : ...
		
		// 5개 생성 시 나가기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		
		String id;
		
		while(true) {
			try {
				if(list.size() >= 5) {
					System.out.println("아이디가 5개 생성되었습니다");
					System.out.println("프로그램 종료");
					break;
				}
				
				System.out.println("아이디를 입력해주세요");
				id = br.readLine();

				if(duplicate(list, id)) {
					continue;
				}
				
				list.add(id);
				
				for (String v : list) {
					System.out.print(v + " ");
				}
				System.out.println();
				
			} catch (IOException e) {
				System.out.println("입력 오류");
			}
		}
		
		// 위 코드에서 중복된 아이디를 검사하는 로직 추가
		// 중복되면 중복된 아이디 라고 하고 다시 입력하게 만들기
		
		
	}

	private static boolean duplicate(List<String> list, String id) {
		boolean duplication = false;
		
		for (String v : list) {
			if(v.equals(id)) {
				System.out.println("중복된 아이디입니다");
				duplication = true;
			}
		}
		
		return duplication;
	}
}
