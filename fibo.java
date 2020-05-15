import java.util.Scanner;
import java.util.Arrays;
public class fibo {
	

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int tests[] = new int[t];
		for(int i = 0 ; i < t ; i++)
		{
			tests[i] = sc.nextInt();
		}
		
		int dp[][] = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i =2 ; i < 41 ; i++)
		{
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		
		
		for(int i =0 ; i < t; i++)
		{
			
			int n = tests[i];
			
			int zero = dp[n][0];
			
			int one = dp[n][1];
			
			System.out.printf("%d %d\n", zero, one);
			
		}
		
	}
	

}
