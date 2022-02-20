//Problem 6

import java.util.Scanner;

public class diamondPattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows (Try with the number 5): ");
		int n=sc.nextInt();
		sc.close();
		
		int start=n/2, end=(n/2)-1,print=0;
		for(;start>=0;print=0)
		{
			
			print=print_space(print,start);
			start=print-1;
			end=print_star(print,end)-1;
			System.out.println();
		}
		
		start=1; end=n-3;print=0;
		for(;end>=1;print=0)
		{
			print=print_space(print,start);
			start=print+1;
			end=print_star(print,end)-3;
			System.out.println();
		}
	}
	static int print_space(int print, int start)
	{
		for(;print!=start;print++)
			System.out.print(" ");
		return print;
	}
	static int print_star(int print, int end)
	{
		for(;print<=(end+1);print++)
			System.out.print("*");
		return print;
	}
}
