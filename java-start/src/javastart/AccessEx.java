package javastart;

class Sample {
	public int a;
	private int b;
	int c;
	
	void Sampleshow() {
		System.out.println();
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; // b가 private
		sample.c = 10;
	}
}
