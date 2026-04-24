package ex1;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();

		d.name = "뽀삐";
		d.age = 2;
		d.color = "검정";

		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.color);

		d.eat(); // 부모(슈퍼)
		d.sleep(); // 부모(슈퍼)
		// d.show();
		// 자식 클래스 매서드 호출
		d.bark(); // 자식(서브)
		d.run(); // 자식(서브)

	}
 
}
