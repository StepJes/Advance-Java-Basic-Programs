package polymorphism;

interface A {
	void hello();
}

interface B {
	void welcome();
}

class C implements A, B {
	public void hello() {
		System.out.println("Hello");
	}

	public void welcome() {
		System.out.println("Welcome!!!");
	}
}
