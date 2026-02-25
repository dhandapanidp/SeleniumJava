package code;

class calculator{
	private int a;
	private int b;
	
	public void set(int aa, int bb) {
		this.a=aa;
		this.b=bb;
	}
	
	public void get() {
		int c=a+b;
		System.out.print(c);
	}
	
}	
	
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator ob=new calculator();
		
		ob.set(2, 3);
		ob.get();

	}

}
