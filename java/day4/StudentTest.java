package day4;
public class StudentTest {
 
	String Name;
	int regNo;
    public static void display(int regno) {
        System.out.println("Registration No. " + regno);
    }
 
    public static void display(String name) {
        System.out.println("Name. " + name);
    }
 
    
    
    public StudentTest(String name, int regNo) {
		super();
		Name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return Name;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setName(String name) {
		Name = name;
	}

	public static void main(String str[]) {
        StudentTest s1 = new StudentTest("Mary",198);
        display(s1.getName());
        display(s1.getRegNo());
    }
}


