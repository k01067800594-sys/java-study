package javastart;

import java.util.Scanner; //Scanner클래스 사용
//import는 ctrl + shitf+o

public class ConvertType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드로 입력 위해
		// import java.util.Scanner
		// 문자열 입력
		System.out.println("숫자를 문자로 입력");
		String a = sc.nextLine(); // nextline()는 문자열 1줄
		// 문자열 -> 숫자 변환
		double d = Double.parseDouble(a); // a(문자)->num(정수)
		// Integer(정수) : Wrapper class(래퍼클래스)
		// 기본형을 객체로 감싸는 클래스

		// 숫자 -> 문자열
		String d1 = Double.toString(d); // toString(문자로 변환)
		// toString앞에 타입 지정
		String d2 = String.valueOf(d); // valueOf(문자로 변환)
		// valueOf : 타입 관계 없음

		// 출력
		System.out.println("입력 문자열 : " + a);
		System.out.println("숫자로 변환 : " + d);
		System.out.println("다시 문자열로 변환(toString) : " + d1);
		System.out.println("다시 문자열로 변환(valueOf) : " + d2);

		sc.close();
	}
}
