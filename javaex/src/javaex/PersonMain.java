package javaex;

class Person {
	private int age; // private : 그 클래스안 접근

	public int getAge() { // get~: 값을 반환
		return age;
	}

	public void setAge(int age) { // set~: 값을 설정
		// 나이가 1~100세 까지 -> 나이 입력 오류
		if (age < 0 || age > 100) {
			System.out.println("나이 입력 오류(1~100세 입력)");
		} else {
			this.age = age;
		}
	}

}

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();

		// p.age= -10:private->직접 접근 안됨
		p.setAge(25); // 값을 설정
		System.out.println("현재나이:"+p.getAge());
	}

}
