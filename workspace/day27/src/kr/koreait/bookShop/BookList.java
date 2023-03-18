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
		String str = "";
		
		str += "====================================\n";
		str += "title	author	publish	date	price	\n";
		str += "====================================\n";
		
		double total = 0;
		
		for (int i = 0; i < size; i++) { // size로 하면 빈 공간 때문에 null 에러가 남
			if(bookList[i] == null) { // 객체 타입 배열의 기본값이 null이기 때문
				break;
			}
			str += String.format("%s	", bookList[i].getTitle());
			str += String.format("%s	", bookList[i].getAuthor());
			str += String.format("%s	", bookList[i].getPublisher());
			str += String.format("%s	", bookList[i].getDate());
			str += String.format("%.2f	\n", bookList[i].getPrice());
			total += bookList[i].getPrice();
		}
		
		str += "====================================\n";
		str += String.format("total price : %.2f	\n", total);
		str += "====================================\n";
		
		return str;
	}

//	bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO book) {
		
		// if문을 사용하는 전통적인 예외처리
//		if(count < size) {
//			bookList[count++] = book;
//		}else {
//			System.out.println("array is full. " + book.getAuthor() + "'s book is not added");
//		}
		
//		try ~ catch문 사용하여 자바 예외처리하기
//		예외가 발생할 것으로 예상되는 코드에 try 블록을 사용한다
//		예외가 발생되면 처리할 문장을 catch 블록에 쓴다
//		try에서 코드 실행 중 예외가 발생하면 catch 블록으로 넘어간다
//		웬만하면 모든 Exception보다는, 특정 발생한 Exception을 따로따로 catch하도록 한다
//		나머지 어떤 에러가 발생할지 모르겠으면, 그냥 Exception을 적어준다 (모든 에러를 감지 가능)
//		나머지 모든 예외 감지가 맨 아래에 있어야 함
		
		try {
			bookList[count++] = book;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array is full. " + book.getAuthor() + "'s book is not added");
		} catch(Exception e) {
			System.out.println("unexpected error");
			e.printStackTrace(); // 해당 예외에 대한 정보를 출력하는 메소드
		} finally {
			// finally 블록은 선택 사항으로서, 예외 발생 여부와 관계 없이 무조건 실행해야 할 문장이 있으면 적음
//			System.out.println("test");
		}
	}

}
