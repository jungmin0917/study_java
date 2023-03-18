package day24;

public class MemoTest {
	public static void main(String[] args) {
//		MemoVO.count = 100; // 이렇게 수정하면 100부터 번호가 시작되게 된다
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("jungmin", true, "hello");
		MemoVO vo3 = new MemoVO("chaeyeon", true, "hihi :)");
		
		System.out.println(vo1);
		System.out.println(vo2);
		System.out.println(vo3);
		
		vo2.count = 100; // 이렇게 되면 해당 인스턴스의 변수만 바꾼다.
//		다만, count는 static 변수여서 해당 class로 생성된 모든 객체가 공유하게 된다.
//		하지만, 해당 인스턴스 자체를 출력하면 그대로 1, 2, 3... 이 나온다.
		System.out.println(vo3.count);
//		System.out.println(vo2.name); // name은 private 변수이기 때문에 외부에서 접근 불가능
		
//		getter, setter 설정 후
		System.out.println(vo2.getName());
		vo2.setName("jungmini");
		System.out.println(vo2.getName());
	}
}
