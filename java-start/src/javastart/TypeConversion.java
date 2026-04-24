package javastart;

public class TypeConversion {
	// 타입 변환
	public static void main(String[] args) {
		byte b = 127; // 1바이트 정수 -128 ~127
		int i = 100;
		System.out.println(b + i); // 227
		// b가 int 타입으로 자동 변환
		System.out.println(10 / 4); // 2 정수/정수->정수
		System.out.println(10.0 / 4); // 2.5
		// 4rk 4.0으로 자동변환
		System.out.println((byte) (b + i)); // -29
		// 1바이트는 8비트 -128 ~127
		// 4바이트->1바이트 오버플로 발생->원하지않은 답이 나옴
		System.out.println((int) (2.9 + 1.8)); // 4
		System.out.println((int) 2.9 + (int) 1.8); // 3
		System.out.println((double) 10 / 4);// 2.5
		// 10->실수->10.0 10.0/4->실수/정수->4=4.0
		int a = 10;
		double result = a + 3.5; // 13.5
		System.out.println(result);
	}

}
