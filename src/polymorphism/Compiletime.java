package polymorphism;

public class Compiletime {
	public static void main(String[] args) {
		CompiletimeA coma = new CompiletimeA();
		coma.add();
		coma.add(1, 2);
		coma.add(5.75f, 45);
		coma.add(2, 23.45);

	}
}
