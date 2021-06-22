package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountCombinations
{
	public void getNumberOfWays(int total, int k)
	{
		List<Integer> combList = new ArrayList<>();
		combinationUtil(total, k, 0, 1, combList);
	}

	public void combinationUtil(int n, int sum, int cs, int sn, List<Integer> combList)
	{
		if(cs==sum)
		{
			System.out.println(combList);
			return;
		}

		for(int i=sn;i<=n;i++)
		{
			if(cs+i>sum)
			{
				break;
			}
			combList.add(i);
			combinationUtil(n, sum, cs+i, i, combList);
			combList.remove(combList.size()-1);
		}
	}

	public static void main(String[] as)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter W: ");
		int w = s.nextInt();
		System.out.println("Enter T: ");
		int t = s.nextInt();
		CountCombinations c = new CountCombinations();
		c.getNumberOfWays(w, t);
	}
}
