package polymorphism;

public class CompiletimeA {

	void add() {
		int a = 2, b = 3;
		int sum = a + b;
		System.out.println("Addition in no Parameter is: " + sum);
	}

	void add(int a, int b) {
		int integer = a + b;
		System.out.println("Integer Parameter is: " + integer);
	}

	void add(float a, int b) {
		float flt = a + b;
		System.out.println("Float and int is: " + flt);
	}

	void add(int a, double b) {
		double d = a + b;
		System.out.println("Int and double is: " + d);
	}

}
