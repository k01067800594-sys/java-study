package test;

class Car { // 설계도 class
	String model;
	int speed;

	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	void print() {
		System.out.println(model + "," + speed);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Car c1 = new Car("Sonata", 100);
		Car c2 = new Car("avante", 120);
		
		c1.print();
		c2.print();

	}
}
