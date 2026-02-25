package code;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0;
		int second=1;
		int fin=0;
		System.out.print(first);
		System.out.print(second);
		for(int i=1;i<=7;i++) {	
			  fin=first+second;
			 first=second;
		 	 second=fin;
			 System.out.print(fin);
		}
		
	}

}
