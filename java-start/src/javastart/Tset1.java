//[조건 1] 클래스 설계
//Person 클래스를 작성하시오.
//멤버 변수(필드)
//이름 : name (문자열)
//나이 : age (정수)
//
//[조건 2] 생성자 작성 (Person )
//생성자를 이용하여 객체 생성 시 이름과 나이를 초기화하시오.
//생성자 매개변수 이름은 name, age로 한다.
//멤버 변수와 매개변수를 구분하기 위해 this 키워드를 사용할 것
//
//[조건 3] 메서드 작성 
//다음 기능을 수행하는 메서드를 작성하시오.
//메서드 이름: checkAdult()
//기능:
//나이가 19세 이상이면 → "성인" 출력
//나이가 10세 이상이면 -> "청소년" 출력
//10세 미만이면 "소인" 출력
//
//[조건 4] main 메서드 작성
//Person 객체를 생성하시오.
//p는 Person 객체를 가리키는 “참조 변수”이다.
//이름은 "john", 나이는 19로 설정한다.
//checkAdult() 메서드를 호출하시오.
package javastart;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void checkAdult() {
		System.out.println(name + ", " + age);

		if (age >= 19) {
			System.out.println("성인");
		} else if (age >= 10) {
			System.out.println("청소년");
		} else if (age <= 10) {
			System.out.println("소인");
		}

	}
}

public class Tset1 {
	public static void main(String[] args) {
		Person p = new Person("Jhon", 19);
		p.checkAdult();

	}

}
