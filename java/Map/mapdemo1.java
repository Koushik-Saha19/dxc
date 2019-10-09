package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("Braistow", 55);
		scores.put("Ben", 85);
		scores.put("Joe", 60);
		scores.put("Jason", 70);
        scores.put("Eoin", 90);
		
		//System.out.println(scores.get("Jason"));
        System.out.println(scores);

	}

}
