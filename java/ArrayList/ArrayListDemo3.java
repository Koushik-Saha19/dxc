package ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List names = new Vector();
		names.add("Joe1");
		names.add("Joe2");
		names.add("Joe3");
		names.add("Joe4");
		names.add("Joe5");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		int i = Collections.binarySearch(names, "Joe3");
		System.out.println(i);
	}

}
