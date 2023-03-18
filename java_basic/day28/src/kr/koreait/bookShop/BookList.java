package kr.koreait.bookShop;

import java.util.ArrayList;

// 여러 권의 책 정보 (BookVO)를 기억할 클래스
public class BookList {
	
	// 이번엔 ArrayList 이용하여 구현
	// 기본 생성자, 생성자, getter, setter 전부 필요 없음
	// ArrayList 선언 방법 : 접근자 ArrayList<자료형> arraylist명 = new ArrayList<>();
	private ArrayList<BookVO> bookList = new ArrayList<>();
	
	// getter, setter
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	// 출력용 toString 오버라이딩
	@Override
	public String toString() {
		String str = "";
		
		str += "====================================\n";
		str += "title	author	publish	date	price	\n";
		str += "====================================\n";
		
		double total = 0;
		
		// ArrayList에 저장된 데이터의 개수만큼 반복한다
		
//		향상된 for (foreach와 같음. iterable 객체에서 전체 요소를 순회하는 것)
//		for(배열이나 ArrayList의 자료형 변수명 : Array 또는 ArrayList명){
//			반복해서 실행할 문장;
//			...;
//		}
		
		for (BookVO book : bookList) {
			str += String.format("%s	", book.getTitle());
			str += String.format("%s	", book.getAuthor());
			str += String.format("%s	", book.getPublisher());
			str += String.format("%s	", book.getDate());
			str += String.format("%.2f	\n", book.getPrice());
			total += book.getPrice();
		}
		
		str += "====================================\n";
		str += String.format("total price : %.2f	\n", total);
		str += "====================================\n";
		
		return str;
	}

//	bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO book) {
		// 예외 처리도 필요없어짐 (ArrayList는 사이즈가 유동적임)
		bookList.add(book);
	}

}
