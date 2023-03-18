package kr.koreait.bookShop;

import java.time.LocalDate;

// 도서 관리 시스템 만들기
public class BookShop {
	public static void main(String[] args) {
		
		BookList bookList = new BookList(4);
		
		// 인스턴스 생성 (book1의 정보를 입력하여)
		BookVO book1 = new BookVO("java", "jungmin", "koreapub", LocalDate.of(2015, 5, 15), 35000);
		BookVO book2 = new BookVO("java", "chaeyeon", "koreapub", LocalDate.of(2015, 5, 15), 35000);
		BookVO book3 = new BookVO("java", "gildong", "koreapub", LocalDate.of(2015, 5, 15), 35000);
		BookVO book4 = new BookVO("java", "chunhyang", "koreapub", LocalDate.of(2015, 5, 15), 35000);
		BookVO book5 = new BookVO("java", "gilsu", "koreapub", LocalDate.of(2015, 5, 15), 35000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);

		System.out.println(bookList);
		
	}
}
