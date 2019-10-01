package day5;

abstract class Animal{
	public void makenoise() {
		System.out.println("");
	}
	public void eat() {
		
	}
   public void sleep() {
		
	}
   public void roam() {
	
}
}
 abstract class Feline extends Animal{

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		super.roam();
	}
	
}
 class Lion extends Feline{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		super.makenoise();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	 
 }
 class Tiger extends Feline{
	 @Override
		public void makenoise() {
			// TODO Auto-generated method stub
			super.makenoise();
		}

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			super.eat();
		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			super.sleep();
		}
 }
 class Cat extends Feline{
	 @Override
		public void makenoise() {
			// TODO Auto-generated method stub
			super.makenoise();
		}

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			super.eat();
		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			super.sleep();
		}
 }
 
 
 abstract class Hippo extends Animal{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		super.makenoise();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}
 
 
 abstract class Canine extends Animal{

		@Override
		public void roam() {
			// TODO Auto-generated method stub
			super.roam();
		}
		
	}
 class Dog extends Canine{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		super.makenoise();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	 
 }
 class Wolf extends Canine{

	@Override
	public void makenoise() {
		// TODO Auto-generated method stub
		super.makenoise();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	 
 }
public class Abstract_Class_Exercixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
