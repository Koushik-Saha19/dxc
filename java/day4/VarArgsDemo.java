package day4;

public class VarArgsDemo {

	
	public static int sum(int p, int...numbers) {
		int sum = 0;
		for(int i: numbers)
			sum +=i;
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(78,8,81));
		System.out.println(sum(8,8,8,8,8,8,83));
		
		System.out.printf("The sum is : %d", sum(2,2));
	}

}
