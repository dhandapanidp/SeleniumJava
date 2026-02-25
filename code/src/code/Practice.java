package code;

import java.util.Scanner;

class Practice{
	
	public static void main(String[] args) {
		System.out.println("Enter the number ::");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum = 0;
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+ " ");
				sum = sum+ i;
			}
		}
		System.out.println("\n"+sum);
		
	}
	public static boolean isPrime(int num)
	{
		if(num==2)
			return true;
		
		if(num%2==1)
		{
			int count = 0;
			for(int i =2; i<=(num/2);i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==0)
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
	
}