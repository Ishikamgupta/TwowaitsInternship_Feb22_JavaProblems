//Problem 3

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		take_input(sc);
	}
	static void take_input(Scanner sc)
	{
		System.out.print("Enter the number whose factorial has to be found: ");
		try
		{
			String num=sc.next();
			int n=Integer.parseInt(num);
			System.out.println(n+"! = "+find(n));
		}
		catch(Exception e)
		{
			System.out.println("**Please enter positive integer value\n");
			take_input(sc);
		}
	}
	static int find(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return n*find(n-1);
	}
}
