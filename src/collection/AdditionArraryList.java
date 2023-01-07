package collection;

import java.util.ArrayList;
import java.util.Collection;

public class AdditionArraryList {
	public static void main(String[] args) {
		Collection val = new ArrayList();
		val.add(4);
		val.add(5);
		val.add("Hello");
//		val.retainAll(val);
//		val.removeAll(val);
		System.out.println(val);
	}
}
