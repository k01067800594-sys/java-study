package javastart;

import java.util.Scanner;

class BookA {
	String title;
	int price;

	BookA(String title, int price) {
		this.title = title;
		this.price = price;
	}
}

public class BookArray {
	public static void main(String[] args) {
		BookA[] b = new BookA[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println("제목 입력:");
			String title = sc.nextLine();
			System.out.println("가격 입력:");
			int price = sc.nextInt();
			sc.nextLine();
			b[i] = new BookA(title, price); // 배열 요소 객체 생성
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].title + ", " + b[i].price);
		}
		sc.close();
	}
}
