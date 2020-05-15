import java.util.Scanner;
import java.util.Arrays;
public class LongList {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i< n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		int dp[] = new int[n];
		
		for(int i = 0 ; i< n; i ++)
		{
			int maxx = 0;
			int now = arr[i];
			for(int j = 0 ; j < i ; j++)
			{
				if (arr[j] < now)
				{
					if( dp[j] > maxx)
					{
						maxx = dp[j];
					}
				}
				
			}
			
			dp[i] = maxx + 1;
		}
		
		System.out.println(Arrays.toString(dp));
		Arrays.sort(dp);
		System.out.printf("%d", dp[n-1]);
	}
}
