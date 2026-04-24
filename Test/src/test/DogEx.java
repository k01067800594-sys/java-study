package test;

public class DogEx extends AnimalEx {
	String breed;
	
	DogEx(String name, int age, String breed){
		super(name,age);
		this.breed=breed;
	}
	void showDog() {
		show();
		System.out.println("품종: "+breed);
	}

}
