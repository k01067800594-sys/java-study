package javastart;

class Book2 {
	String title;
	String author;

	Book2() {
		this("", ""); // 2
		System.out.println("기본생성자 호출"); // 5
	}

	Book2(String title) { // 생성자 호출시 매개변수 title만 가져옴
		// this.title = title; // 왼쪽 title : 멤버변수, 오른쪽 title : 매개변수
		// author = "작가미상";
		this(title, "작가미상"); // 7
	}

	Book2(String title, String author) {
		this.title = title; // 3 //8 //11
		this.author = author; // 4 //9 //12
	}

	void show() {
		System.out.println("책제목: " + title + "\n작가: " + author);
	} // 14 //16 //18

}

public class BookMain {
	public static void main(String[] args) {
		Book2 b1 = new Book2(); // 객체 생성 // 1(생성자 진입)
		Book2 b2 = new Book2("심청전"); // b2 : 참조변수(주소) // 6(생성자진입)
		Book2 b3 = new Book2("푹풍의 언덕", "에밀리 브론테"); // 10(생성자진입)

		b1.show(); // 13
		b2.show(); // 15
		b3.show(); // 17
	}
	
//	this.는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//	this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//	this() 설명
//	① 생성자에서만 사용 가능
//	this();  // 생성자 안에서만 사용 가능
//	② 반드시 첫 줄에 써야 함
//	Car() {
//	    this("Avante");  // 반드시 첫 줄
//	}
//
//	Car() {
//	    speed = 100;
//	    this("Avante"); // 에러
//	}
//	③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//	Car() {
//	    this(); //  무한 호출 → 컴파일 에러

}
