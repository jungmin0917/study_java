package ex1_enum;

public class ItemMain {
	public static void main(String[] args) {
		
//		열거형의 생성자를 외부에서 호출하는 것은 불가능하다.
//		Item item = new Item();
		
//		for문 이용하여 열거형의 전체 내용 출력하기
		
		Item[] items = Item.values(); // 여기서 values 메소드는 static이기 때문에 객체화하지 않아도 사용할 수 있다

//		향상된 for문 (반복 가능한 객체를 순회하면서 처리함)
//		for(자료형 순환자 : 객체명){ }
		for(Item item : items) {
			System.out.printf("아이템명 : %s, itemStr : %s, sign : %d\n", item.name(), item.getItemStr(), item.getSign());
		}
	}
}
