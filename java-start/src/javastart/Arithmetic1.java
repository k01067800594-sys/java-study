package javastart;

public class Arithmetic1 {
	//main 메서드
	public static void main(String[] args) {
		int x=20, y=10;
		int res1 = add(x,y);	//메서드 호출
		//x, y->인수
		int res2 = sub(x,y);	//메서드 호출
		System.out.println(res1);
		System.out.println(res2);
		
	}
	//add 메서드
	public static int add(int a, int b){
		//int a, int b : 매개변수
		return a+b;	//반환
		
	}
	//sub 메서드
	public static int sub(int a, int b) {
		return a-b;	
	}
	
}
