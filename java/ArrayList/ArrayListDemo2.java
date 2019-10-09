package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ArrayListDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set names = new HashSet();
		names.add("Joe1");
		names.add("Joe2");
		names.add("Joe3");
		names.add("Joe4");
		names.add("Joe5");
		
		
		System.out.println(names);
		
		System.out.println("\n");
		
		Iterator ii = names.iterator();
		
		while(ii.hasNext()) {
			String str = (String)ii.next();//here we doing type casing
			System.out.println(str);
		}
		
		
	}

}

