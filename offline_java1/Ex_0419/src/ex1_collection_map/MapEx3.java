package ex1_collection_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class MapEx3 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		// 키보드에서 아이디, 패스워드를 입력받는다.
		
		// id : aaa
		// pw : 1111
		// 아이디가 존재하지 않습니다
		
		// id : lee
		// pw : 3333
		// 비밀번호 불일치
		
		// id, pw 모두 일치하면 로그인 성공
		
		boolean success = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(!success) {
			
			try {
			
				System.out.println("아이디를 입력해주세요");
				String id = br.readLine();
				
				System.out.println("비밀번호를 입력해주세요");
				String pw = br.readLine();
				
				boolean id_exists = map.containsKey(id);
				
				String res = "";
				
				StringBuilder sb = new StringBuilder(res);
				
				sb.append(String.format("id: %s\npw: %s\n", id, pw));
				
				if(!id_exists) {
					sb.append("아이디가 존재하지 않습니다\n\n");
				}else {
					if(!map.get(id).toString().equals(pw)) {
						sb.append("비밀번호가 일치하지 않습니다\n\n");
					}else {
						sb.append("로그인 성공\n\n");
						success = true;
					}
				}
				
				bw.write(sb.toString());
				bw.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










