package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List names = new ArrayList();//here we can use Vector() also in place of ArrayList().....depending on the requirement...  
		
		names.add("Joe1");
		names.add("Joe2");
		names.add("Joe3");
		names.add("Joe4");
		names.add("Joe5");
		
		
		names.remove(2);
		
		System.out.println(names.contains("oson"));
		System.out.println(names.get(3));
		System.out.println(names.isEmpty());
		
		
	}

}
