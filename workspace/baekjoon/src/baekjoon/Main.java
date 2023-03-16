package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// 자바에서 입출력 관련 클래스를 사용할 때, 예외 처리는 필수적임
		// 그래서 main 함수 뒤에 throws IOException을 쓰는 것임

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 위 코드는, 표준 입력을 받기 위해 사용되는 BufferedReader 클래스를 생성하는 코드이다.
		// 문자 입력 스트림을 버퍼링하여 입출력 효율을 높인다.
		// 스트림을 버퍼링한다는 것은, 입력되는 데이터를 미리 메모리 상에 저장해 놓고 나중에 필요할 때 빠르게 접근할 수 있도록 하는 것이다.
		// 입출력 수행 횟수를 줄여, 입출력 성능을 향상시키기 위함이다.
		// 입출력에 따른 오버헤드를 줄이고 성능을 높일 수 있다.
		
		int result = 0;
		
		// 여기서 br.readLine() 메소드를 사용하면 개행 문자(\n)을 만나기 전까지 읽은 '문자열'을 반환한다.
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// br.readLine() 메소드로 입력받은 문자를 내가 적은 구분자(delimiter)를 기준으로 하여 token화 시킨다
		// 하지만 임의의 위치에 있는 토큰에 접근하거나 정렬하거나 이런 건 불가능함. 순서대로 접근하거나 문자열 분리 시에 유용하다고 볼 수 있다
		
		int v = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			if(now == v) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}