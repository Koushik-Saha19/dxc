package day4;

import java.util.StringTokenizer;

public class StrungTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String message = "Welcome:to:Banglore:India:Asis:Earth:SolarFamily:MilkywayGalaxy";
		StringTokenizer st = new StringTokenizer(message,":");
		
		int totalToken = st.countTokens();
		int count = 0;
		
		while(st.hasMoreTokens()) {
			count++;
			System.out.println(count +" " + st.nextToken());
		}
			
	
		System.out.println("Total words are:" + totalToken);
		
	}

}
