package collection;

import java.util.LinkedList;

public class LinkedListArray {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		list.add("hello");
		list.add("dear");
		list.add("root");
		list.add(10);
		list.add(32);

		System.out.println("LinkedList:" + list);
		System.out.println(" 32 is at index: " + list.indexOf(32));

	}
}
