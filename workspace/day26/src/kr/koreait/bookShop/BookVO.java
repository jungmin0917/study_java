package kr.koreait.bookShop;

import java.time.LocalDate;

// 책 한 권의 정보를 기억하는 클래스 (Book Value Object)
public class BookVO {
	private String title;		// 도서명
	private String author;		// 저자명
	private String publisher;	// 출판사명
	private LocalDate date;			// 출판일
	private double price;		// 가격

	// 기본 생성자
	public BookVO() {}

	// 생성자 멤버변수 초기화
	public BookVO(String title, String author, String publisher, LocalDate date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}

	// 출력용 toString 오버라이딩
	@Override
	public String toString() {
		return String.format("%s %s %s %s %.2f", title, author, publisher, date, price);
	};
	
}
