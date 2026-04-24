package javastart;

import java.util.Scanner; //java.util:패키지 Scanner:클래스

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체 생성
		// Scanner:클래스 이름
		// System.in : 키보드로 입력
		// Scanner sc -> Scanner(클래스, 타입), sc->참조변수

		System.out.println("이름 입력");
		String name = sc.nextLine();

		System.out.println("주소 입력");
		String addr = sc.nextLine();

		System.out.println("나이 입력");
		int age = sc.nextInt();

		System.out.println("체중 입력");
		double wei = sc.nextDouble();

		System.out.println("결혼 여부(true/false)");
		boolean mar = sc.nextBoolean();

		System.out.println("이름: " + name);
		System.out.println("주소: " + addr);
		System.out.println("나이: " + age);
		System.out.println("체중: " + wei);
		System.out.println("결혼: " + mar);

		sc.close(); // 입력도구 종료, 자원 정리
	}

}
