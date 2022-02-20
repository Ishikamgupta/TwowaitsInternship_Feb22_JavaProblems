//Problem 5

import java.util.Scanner;

public class permutation_combination {

	public static void main(String[] args) 
	{
		//p=n!/(n-r)!
		//c=n!/r!*(n-r)!
		
		System.out.print(">> A permutation is the choice of r things from a set of n things without replacement and where the order matters."
				+ "\n>> A combination is the choice of r things from a set of n things without replacement and where order does not matter"
				+ "\n\nEnter value of 'r': ");
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.print("Enter value of 'n': ");
		int n=sc.nextInt();
		
		int numerator=factorial(n);
		int denominator=factorial(n-r);
		
		permutation(numerator, denominator);
		combination(r,numerator, denominator);
	}
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}
	static void permutation(int numerator, int denominator)
	{
		System.out.println("\nPermutation result: "+(numerator/denominator));
	}
	static void combination(int r, int numerator, int denominator)
	{
		denominator*=factorial(r);
		System.out.println("\nCombination result: "+(numerator/denominator));
	}
}
