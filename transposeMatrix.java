//Problem 10

import java.util.Scanner;

public class transposeMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r=sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("\nEnter the array elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				arr[i][j]=sc.nextInt();
		}
			
		System.out.println("\n>> Given array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n>> Transpose of given array: ");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
