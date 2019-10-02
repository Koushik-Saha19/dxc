package day5;

class Food {
	int ratings;

	void giveFeedback() {
		System.out.println("Please give rating for food");
	}
}

class Dosa extends Food {

}
class idli extends Food {
	
  void idliintro() {
     System.out.println("This is idli");
}
}

class Animal_1{
	
	public Food eat() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Food eat(Food food) {
		Food f = new Food();
		f.ratings = 5;
		return f;
	}

	
}

class snake extends Animal_1 {

	@Override
	public Dosa eat(Food food) {
		// TODO Auto-generated method stub
		Dosa d = new Dosa();
		d.ratings = 1;
		System.out.println(d.ratings);
		return d;
	}

}

class fox extends Animal_1 {

	@Override
	public idli eat() {
		System.out.println("fox are clever");
		return null;
	}

	public void bark() {
		System.out.println("fox bark");
	}

}

public class Covariant_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fox f = new fox();
		f.eat();
		f.bark();
		snake s = new snake();
		Food fd = new Food();
		s.eat(fd);
		
		
	}

}