//Problem 7

import java.util.Scanner;

public class reverse_letters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String ip=sc.next(), rev="";
		sc.close();
		
		for(int i=ip.length()-1;i>=0;i--)
			 rev+=ip.charAt(i);
		
		System.out.println(">>> The reverse of string "+ip+" is "+rev);
	}
}
