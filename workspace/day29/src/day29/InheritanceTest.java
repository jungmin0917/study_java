package day29;

public class InheritanceTest {
	public static void main(String[] args) {
		
//		부모, 자식 클래스의 개념 (상속)이 있는 이유
//		여러 개의 클래스에서 공통적으로 사용할 부분(속성(필드), 메소드)들을 부모 클래스에 정의해놓고 자식 클래스에서는 이를 물려받아 자기가 커스터마이징할 부분만 커스텀해서 사용하면 코드 재사용성이 높아져서 생산성이 올라가기 때문임
		
		Parent parent1 = new Parent();
		Parent parent2 = new Parent("jungmin", true);
		
		System.out.println(parent1);
		System.out.println(parent2);
		
		Child child = new Child("jungmin", true, 30, "jungmin0917");
		
		System.out.println(child);
		
	}
}
