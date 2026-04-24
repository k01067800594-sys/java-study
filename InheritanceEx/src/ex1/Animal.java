package ex1;

//부모클래스(슈퍼 클래스)
public class Animal {
	String name;
	int age;
	String color;

	public void eat() {
		System.out.println(name + "이(가) 먹이를 먹습니다");
	}

	public void sleep() { 
		System.out.println(name + "이(가) 잠을 잡니다");
	}

//	public void show() {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(color);
//	}
}

// 자식클래스(서브 클래스)
class Dog extends Animal {

}