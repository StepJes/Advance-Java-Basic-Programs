package lamda;

interface Addable {
	int add(int a, int b);
}

public class MultipleParam {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> (a + b);

		System.out.println(ad1.add(40, 60));

		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);

		System.out.println(ad2.add(800, 200));
	}
}