package pack1;

public class Parent {
	//System.out.println("=== 같은 패키지 테스트 ==="); 매서드 안에 넣어야하는데 넣질 않음
		public int a = 10;
		protected int b =20;
		int c=30;	//default
		private int d=40;
		
		public void show() {
			System.out.println("Parent 매서스 실행");
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);//같은 클래스
			//d 변수는 같은 클래스이기에 가능하다
		}
}
