package code;

import java.util.Scanner;

public class Laptop {
       
	

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number: ");
	 int num=sc.nextInt();
	 
	 if(num==2) {
		 System.out.println("This is Prime Number");
	 } int count=0;
	 if(num%2!=0) {
		 if(num%2!=0)
			 count++;
	 }if(count==1)
		 System.out.println("This is Prime");
	 else
		 System.out.println("Not a Prime");

	}
}
