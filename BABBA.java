import java.util.Scanner;
public class BABBA {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int dp[][] = new int[n+1][2];
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		
		dp[1][1] = 0;
		dp[1][1] = 1;
		
		for(int i = 2 ; i <= n ; i++)
		{
			dp[i][0] = dp[i-2][0] + dp[i-1][0];
			dp[i][1] = dp[i-2][1] + dp[i-1][1];
		}
		
		System.out.printf("%d %d", dp[n][0], dp[n][1]);
		
	}
}
