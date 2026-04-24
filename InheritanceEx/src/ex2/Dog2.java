package ex2;

public class Dog2 extends Animal2 {
	@Override
	public void sound() {
		//Override : 자식이 부모와 동일한 매서드를 재정의한다
		//상속시 가능
		System.out.println("강아지가 짖습니다");
	}

	@Override
	public void move() {
		System.out.println("강아지가 움직입니다");
	}

}
