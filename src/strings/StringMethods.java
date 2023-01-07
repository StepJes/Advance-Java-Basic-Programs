package strings;

public class StringMethods {
	public static void main(String[] args) {
		String a = "Hello JAva!!!";
		String b = "Welcome";
		
		System.out.println("Addition of both String: \n"+a+b);

		int l1 = a.length();
		int l2 = b.length();
		System.out.println("Length of a is: " + l1 +" and b is: "+l2);
		
		System.out.println("Upper case: "+b.toUpperCase());
		System.out.println("Lower case: "+a.toLowerCase());
		
		System.out.println("Concatenate: "+a.concat(b));
		

	}
}
