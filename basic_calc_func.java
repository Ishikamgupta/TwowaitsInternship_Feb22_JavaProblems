//Problem 1

import java.util.Scanner;

public class basic_calc_func {
	public static void main(String[] args) 
	{
		System.out.println("Welcome, User!\n\n"
				+ "Which calculator function to perform?");
		Scanner sc=new Scanner(System.in);
		float prev_ans=0, curr_ans=0;
		choice_follow(sc,prev_ans,curr_ans);
		sc.close();
	}
	static void choice_follow(Scanner sc,float prev_ans, float curr_ans)
	{
		int n=display_operation(sc);
		if(n>=1 && n<=6)
		{
			switch(n)
			{
				case 6:System.out.println("Ok, thankyou!");
						break;
				case 1: curr_ans=Addition(sc,prev_ans);
						prev_ans=ahead_choice(sc, prev_ans,curr_ans);
						choice_follow(sc,prev_ans,curr_ans);
						break;
				case 2:curr_ans=Subtraction(sc,prev_ans);
					   prev_ans=ahead_choice(sc, prev_ans,curr_ans);
					   choice_follow(sc,prev_ans,curr_ans);
					   break;
				case 3: curr_ans=Multiplication(sc,prev_ans);
						prev_ans=ahead_choice(sc, prev_ans,curr_ans);
					   choice_follow(sc,prev_ans,curr_ans);
					   break;
				case 4:curr_ans=Quotient(sc,prev_ans);
					   prev_ans=ahead_choice(sc, prev_ans,curr_ans);
					   choice_follow(sc,prev_ans,curr_ans);
					   break;
				case 5: curr_ans=Remainder(sc,prev_ans);
						prev_ans=ahead_choice(sc, prev_ans,curr_ans);
					   choice_follow(sc,prev_ans,curr_ans);
					   break; 
			}
		}
		else
			choice_follow(sc,prev_ans,curr_ans);
	}
	static int take_digit(Scanner sc)
	{
		System.out.print("\nEnter valid digits: ");
		return sc.nextInt();
	}
	static int display_operation(Scanner sc)
	{
		System.out.print("1.Addition\n2.Subtraction\n"
				+ "3.Multiplication\n4.Quotient finding\n"
				+ "5.Remainder finding\n6.None(Exit)\n\n"
				+ "Enter your choice(should be a positive integer value): ");
		
		try
		{
			String ch=sc.next();
			int n=Integer.parseInt(ch);
			if(!(n>=1 && n<=6))
				throw new Exception();
			else
				return n;
		}
		catch(Exception e)
		{
			System.out.println("**Please enter from the inclusive range of 1 to 6 only\n");
		}
		return -1;
	}
	static float ahead_choice(Scanner sc, float prev_ans,float curr_ans)
	{
		System.out.print("\nContinue with...?\n1. Perform ahead operation on the above answer\n"
				+ "2. Perform operation on new digits\n\n"
				+ "Enter your choice: ");
		try
		{
			String ans=sc.next();
			int n=Integer.parseInt(ans);
			if(n==1)
				prev_ans=curr_ans;
			else if(n==2)
				prev_ans=0;
			else
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("**Please enter either 1 or 2");
			ahead_choice(sc, prev_ans,curr_ans);
		}
		System.out.println();
		return prev_ans;
	}
	static float Addition(Scanner sc, float prev_ans)
	{
		float curr_ans=0;
		if(prev_ans==0)
			curr_ans=take_digit(sc)+take_digit(sc);
		else
			curr_ans=prev_ans+take_digit(sc);
		
		System.out.println(">>> Answer: "+curr_ans);
		return curr_ans;
	}
	static float Subtraction(Scanner sc, float prev_ans)
	{
		float curr_ans=0;
		if(prev_ans==0)
			curr_ans=take_digit(sc)-take_digit(sc);
		else
			curr_ans=prev_ans-take_digit(sc);
		
		System.out.println(">>> Answer: "+curr_ans);
		return curr_ans;
	}
	static float Multiplication(Scanner sc, float prev_ans)
	{
		float curr_ans=0;
		if(prev_ans==0)
			curr_ans=take_digit(sc)*take_digit(sc);
		else
			curr_ans=prev_ans*take_digit(sc);
		
		System.out.println(">>> Answer: "+curr_ans);
		return curr_ans;
	}
	static float Quotient(Scanner sc, float prev_ans)
	{
		float curr_ans=0;
		if(prev_ans==0)
			curr_ans=take_digit(sc)/take_digit(sc);
		else
			curr_ans=prev_ans/take_digit(sc);
		
		System.out.println(">>> Answer: "+curr_ans);
		return curr_ans;
	}
	static float Remainder(Scanner sc, float prev_ans)
	{
		float curr_ans=0;
		if(prev_ans==0)
			curr_ans=take_digit(sc)%take_digit(sc);
		else
			curr_ans=prev_ans%take_digit(sc);
		
		System.out.println(">>> Answer: "+curr_ans);
		return curr_ans;
	}
}
