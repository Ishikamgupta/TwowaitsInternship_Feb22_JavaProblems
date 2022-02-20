//Problem 8

import java.util.Scanner;

public class mirrorInverse_ofArray 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int[] arr=new int[z];
		System.out.println("Enter array elements: ");
		for(int i=0;i<z;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<z;i++)
		{
			if(arr[arr[i]]!=i)
			{
				System.out.println("\n>> Given array is not mirror inverse!");
				return;
			}
		}
		System.out.println("\n>> Given array is mirror inverse!");
	}
}
