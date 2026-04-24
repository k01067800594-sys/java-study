package pack1;

public class ParentTest {
	public static void main(String[] args) {
		Parent p = new Parent();

		System.out.println("Parent 매서스 실행");
		System.out.println("public a=" + p.a);
		System.out.println("public b=" + p.b);
		System.out.println("public c=" + p.c);
		//System.out.println("public d=" + p.d);
		//d가 같은 클래스에서만 접근이 되고 상속받은 서브클래스에선 접근이 안되는 private에 속해 있어서 오류가 뜬다

		System.out.println("=== 같은 패키지 테스트 ===");
	}

}