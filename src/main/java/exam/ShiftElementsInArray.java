package exam;

import java.util.*;
class ShiftElementsInArray
{
	public static void shift(int[] arr, int n)
	{
		int temp;
		int i;
		temp = arr[n-1];
		for(i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] as)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n = s.nextInt();
		System.out.print("Enter the elements of Array: ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}

		shift(a, n);
	}
}
