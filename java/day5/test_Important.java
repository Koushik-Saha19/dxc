package day5;

class Order {
	int i;
	static {
		System.out.println("1.Order class static block ");
	}
	Order() {
		i = 10;
		System.out.println("4.Order class constructor,i= " + i);
	}
	{
		System.out.println("3.Order class instance block,i= " + i);
	}
}
public class test_Important extends Order {
	int j = 9;
	static {
		System.out.println("2.SubOrder class static block");
	}
	test_Important() {
		j = 15;
		System.out.println("6.ubOrder class constructor,j= " + j);
	}
	{
		System.out.println("5.SubOrder class instance block,j= " + j);
	}
	public static void main(String str[]) {
		System.out.println("MAIN");
		new test_Important();
	}
}
