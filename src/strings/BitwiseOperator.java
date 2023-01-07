package strings;

public class BitwiseOperator {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z1 = x & y;
		System.out.println("x & y " + z1);
		boolean z2 = x | y;
		System.out.println("x | y " + z2);
		boolean z3 = x ^ y;
		System.out.println("x ^ y " + z3);
		
		int x1=5;
		int y1=7;
		int z4 = x1<<y1;
		System.out.println("x << y " + z4);
		int z5 = x1>>y1;
		System.out.println("x << y " + z5);

		/*
		 * & | ^ << >>
		 */}
}
