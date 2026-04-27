package exceptionex;

public class Exception02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println("연산을 합니다");
			int result = a / b;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) { //객체 변수 e
			System.out.println("0으로 나눌수 없습니다");
			System.out.println("메시지:"+e.getMessage()); //에러의 원인
		}
		System.out.println("프로그램 종료");
	}

}
