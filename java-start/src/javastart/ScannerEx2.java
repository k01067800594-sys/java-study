package javastart;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("가격");
		int price = sc.nextInt();

		System.out.println("수량");
		double quan = sc.nextDouble();

		System.out.println("상품명");
		String pro = sc.nextLine();
		sc.nextLine();
		// 문자열 입력 -> 숫자 입력 -> 문제없음
		// 숫자 -> 문자열 -> 엔터키를 상쇄를 위해 sc.nextLine(); 사용

		System.out.println("회원 여부(true/false)");
		boolean mem = sc.nextBoolean();

		// 총금액(tot) : 수량 * 가격
		int tot = (int) quan * price;

		// 할인 적용 : 회원(true)이면 10% 할인
		if (mem) {
			tot = (int) (tot * 0.9);
		}

		System.out.println("가격: " + price);
		System.out.println("수량: " + quan);
		System.out.println("상품명: " + pro);
		if (mem) { // boolean이면 mem == ture
			System.out.println("회원입니다");
		} else {
			System.out.println("비회원입니다");
		}
		System.out.println("총금액 " + tot);

		sc.close();
	}

}
