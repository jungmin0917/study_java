package kr.koreait.bookShop;

import java.time.LocalDate;

// 도서 관리 시스템 만들기
public class BookShop {
	public static void main(String[] args) {
		
		BookList bookList = new BookList(5);
		
		// 인스턴스 생성 (book1의 정보를 입력하여)
		BookVO book1 = new BookVO("java", "jungmin", "korea", LocalDate.of(2015, 5, 15), 35000);
		BookVO book2 = new BookVO("spring", "chae", "korea", LocalDate.of(2015, 5, 15), 35000);
		BookVO book3 = new BookVO("boot", "gildong", "korea", LocalDate.of(2015, 5, 15), 35000);
		BookVO book4 = new BookVO("JSP", "chun", "korea", LocalDate.of(2015, 5, 15), 35000);
		BookVO book5 = new BookVO("haha", "gilsu", "korea", LocalDate.of(2015, 5, 15), 35000);
		BookVO book6 = new BookVO("popo", "minho", "korea", LocalDate.of(2015, 5, 15), 35000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);

		System.out.println(bookList);
		
	}
}
