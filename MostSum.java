import java.util.Arrays;
import java.util.Scanner;
public class MostSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int []arr = new int[n];
		for(int i = 0 ; i< n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		
		int []dp = new int[n];
		
		for(int i = 0 ; i < n; i++)
		{
			if(i == 0)
			{        
				dp[i] = arr[i];
			}
			else
			{
				if(dp[i-1] < 0)
				{
					dp[i] = arr[i];
				}
				
				else
				{
					dp[i] = arr[i] + dp[i-1];
				}
			}
			
			
		}
		Arrays.sort(dp);
		
		System.out.printf("%d", dp[n-1]);
	}
}
