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
		
		// Ű���忡�� ���̵�, �н����带 �Է¹޴´�.
		
		// id : aaa
		// pw : 1111
		// ���̵� �������� �ʽ��ϴ�
		
		// id : lee
		// pw : 3333
		// ��й�ȣ ����ġ
		
		// id, pw ��� ��ġ�ϸ� �α��� ����
		
		boolean success = false;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(!success) {
			
			try {
			
				System.out.println("���̵� �Է����ּ���");
				String id = br.readLine();
				
				System.out.println("��й�ȣ�� �Է����ּ���");
				String pw = br.readLine();
				
				boolean id_exists = map.containsKey(id);
				
				String res = "";
				
				StringBuilder sb = new StringBuilder(res);
				
				sb.append(String.format("id: %s\npw: %s\n", id, pw));
				
				if(!id_exists) {
					sb.append("���̵� �������� �ʽ��ϴ�\n\n");
				}else {
					if(!map.get(id).toString().equals(pw)) {
						sb.append("��й�ȣ�� ��ġ���� �ʽ��ϴ�\n\n");
					}else {
						sb.append("�α��� ����\n\n");
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










