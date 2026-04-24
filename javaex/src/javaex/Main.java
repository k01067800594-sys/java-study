package javaex;

public class Main {
	public static void main(String[] args) {
		System.out.println("초기정보");
		Employee e = new Employee("홍길동", 201, 3500000);
		
		e.print();
		
		e.setName("이순신");
		e.setNo(205);
		e.setPay(5000000);
		
		System.out.println("수정정보");
		e.print();
	}
}
