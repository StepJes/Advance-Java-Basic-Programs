package collection;

import java.util.ArrayList;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("dear");
		arr.add("root");
		System.out.println(arr);
		// Iterator<String> it= arr.iterator();
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}
}
