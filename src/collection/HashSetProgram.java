package collection;

import java.util.*;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetProgram {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");

		System.out.println(set);

	}
}
