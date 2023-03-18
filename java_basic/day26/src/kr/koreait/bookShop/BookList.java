package kr.koreait.bookShop;

import java.util.Arrays;

// 여러 권의 책 정보 (BookVO)를 기억할 클래스
public class BookList {
//	bookList라는 이름의 BookVO 객체가 저장될 배열을 생성
	private BookVO[] bookList;		// 이렇게 선언하면, BookVO 객체들만 저장될 수 있는 배열을 만든다.
	private int size;
	private int count;
	
//	자바의 배열 타입으로는, 단순히 기본자료형 뿐만이 아닌, 객체도 타입으로 지정될 수 있다.
	
//	기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고, 
//	배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
//	즉, 크기 없이 실행하면 기본적으로 30개 만큼의 책을 저장할 크기로 배열을 만들고, 크기를 넘겨주면 해당 크기로 만들게 하기
	
	// 기본 생성자
	public BookList() {
		this(30); // 기본 생성자 실행 시 아래의 int size를 인수로 받는 생성자를 실행
	}

	// 추가 생성자
	public BookList(int size) {
		this.size = size; // size 인수를 넘겨받아 현재 클래스의 private 변수 size에 값 할당
		bookList = new BookVO[size]; // size 개를 담을 수 있는 BookVO 객체 타입의 배열 인스턴스 생성
	}

	// getter, setter
	public BookVO[] getBookList() {
		return bookList;
	}
	public void setBookList(BookVO[] bookList) {
		this.bookList = bookList;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	// 출력용 toString 오버라이딩
	@Override
	public String toString() {
		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
	}

//	bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO book) {
		bookList[count++] = book;
	}

}
