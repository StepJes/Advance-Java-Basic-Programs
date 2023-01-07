package lamda;

interface Sayable {
	public String say(String name);
}

public class SingleParam {
	public static void main(String[] args) {

		// Lambda expression with single parameter
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Stephen Nadar "));

		Sayable s2 = name -> {
			return "Yo, " + name;
		};
		System.out.println(s2.say("Roll No.: 32"));

	}
}