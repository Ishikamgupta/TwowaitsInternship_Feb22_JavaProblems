//Problem 4

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String ip=sc.next(), rev="";
		sc.close();
		
		for(int i=ip.length()-1;i>=0;i--)
			 rev+=ip.charAt(i);
		
		if(ip.equalsIgnoreCase(rev))
			System.out.println("The given string is palindrome!");
		else
			System.out.println("The given string is not palindrome!");
	}
}
