package lamda;

interface A {
	void show();

}

class B implements A {

	@Override
	public void show() {
		System.out.println("Yo. Lamda here");
	}

}

public class DemoLamda {
	public static void main(String[] args) {
		A obj = new B();
		obj.show();
	}
}
