package code;

abstract class Animal{
	public abstract void sum();
	public void eat() {
		System.out.print("I am eating");
	}
	
	public abstract int run();
}

class Dog extends Animal{
	public void sum() {
		System.out.println("Hi");
	}
	

	@Override
	public int run() {
		
		return 0;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog object=new Dog();
		object.sum();
		
		

	}

}
