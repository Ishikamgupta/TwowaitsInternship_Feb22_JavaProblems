//Problem 2

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		int f1=0,f2=1,f3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which fibonacci series has to be calculated: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("\n>> Fibonacci series upto "+n+" numbers: \n"+f1+"\n"+f2);
		for(int i=0;i<n-1;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
