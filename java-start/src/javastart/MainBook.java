//문제)'도서'정보 클래스 만들기
//메인클래스이름:MainBook
//설계도에 해당하는 클래스 : Book 클래스
//Book 클래스의 멤버변수(필드): 문자열-title(책제목), 정수-price(가격)
//Book 클래스의 메서드 : showPrice
//->출력형태: 도서 제목: 제목값, 가격: 가격값
//객체생성 1번시 참조 변수: mybook
//myBook 객체의 초기값 할당(제목-> 자바의 정석	가격->20000)
package javastart;

class Book {
	String title;
	int price;
	//생성자 오버로딩
	Book(String t, int p) {//객체생성자 인자 2개
		title = t;
		price = p;
	}

	Book(String t) {//객체생성자 인자 1개
		title = t;
		price = 0;
	}

	Book() {//객체생성자 인자 0개
		title = "C언어의 정석";
		price = 0;
	}

	void showPrice() {
		System.out.println();
	}
}

public class MainBook {
	public static void main(String[] args) {
		Book mybook = new Book("자바의 정석", 20000);
		Book mybook2 = new Book("파이썬 정석");
		Book mybook3 = new Book();

//		s1.title = "도서 제목";
//		s1.price = 20000;
		mybook.showPrice();
		mybook2.showPrice();

		System.out.println("도서 제목: " + mybook.title);
		System.out.println("가격: " + mybook.price);

	}

}
