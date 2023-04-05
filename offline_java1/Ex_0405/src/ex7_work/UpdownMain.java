package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UpdownMain {
	// UpDown Ŭ������ �����Ͽ� 1 ~ 50 ������ ������ �߻���Ų��.
	// Main Ŭ����������, ����ڰ� Ű����� ������ �Է¹޴´�.
	// �Է¹��� ������ UpDown Ŭ�������� ���ڸ� �Ǵ��Ͽ� �߻��� �������� ũ�� Down, ������ Up�� ����Ѵ�.
	// ����ڰ� ���� ������ ��ӵȴ�.
	// ������ ���� ��� ���α׷��� ����� ���� Ŭ�������� �̷������� �Ѵ�.
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			Updown ud = new Updown();
			
			String res = "";
			
			while(true) {
				System.out.print("1 ~ 50 ������ ������ �Է��ϼ��� : ");
				
				int n = Integer.parseInt(br.readLine());

				res = ud.UpdownGame(n);
				
				if(res.equals("Right")){
					res = "�����Դϴ�!\n" + ud.getCount() + "ȸ ���� ���߼̽��ϴ�";
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
