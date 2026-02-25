package code;

class room{
	public void table() {
     System.out.print("I have a table");
     }
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, int b,int c) {
		System.out.println("different parameter"+a+b);
	}
}

class home{
	
	//Override
	public void table() {
		System.out.print("I have table in another class");
	}
}
	

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		room ob=new room();
		ob.sum(6, 7);
		ob.sum(4, 6, 4);
		ob.table();
	}

}
