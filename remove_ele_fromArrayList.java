//Problem 9

import java.util.ArrayList;
import java.util.Scanner;

public class remove_ele_fromArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(12);
		arr.add(215);
		arr.add(3033);
		arr.add(44881);
		arr.add(5291);
		display(arr);
		
		System.out.print("Enter the element to be removed: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=0; i<arr.size();i++)
		{
			if(arr.get(i)==n)
				arr.remove(i);
		}
		System.out.println();
		display(arr);
	}
	static void display(ArrayList <Integer> arr)
	{
		System.out.println("Current ArrayList elements: "+arr);
	}
}
