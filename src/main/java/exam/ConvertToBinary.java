package exam;

import java.util.*;
class ConvertToBinary
{
	public static void toBinary(int n)
	{
		int[] binaryNum = new int[100];
		int i=0;
		if(n<0)
		{
			System.out.println("Negative Number Entered");
		}

		else
		{
			while(n>0)
			{
				binaryNum[i] = n%2;
				n=n/2;
				i++;
			}
		}

		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binaryNum[j]);
		}
	}

	public static void main(String[] as)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		toBinary(n);
	}
}
