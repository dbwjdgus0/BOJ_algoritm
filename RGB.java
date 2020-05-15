
import java.util.Scanner;
public class RGB {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][]costs = new int[3][n];
		
		for (int i = 0 ; i < n ; i++)
		{
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();
			
			int [] temp = new int[3];
			temp[0] = r;
			temp[1] = g;
			temp[2] = b;
			
			costs[i] = temp;
			
		}
		
		int [][]dp = new int[3][n];
		
		for (int i = 0 ; i < n ; i++)
		{
			if(i == 0)
			{
				dp[0][0] = costs[0][0];
				dp[0][1] = costs[0][1];
				dp[0][2] = costs[0][2];
				
			}
			
			else
			{
				
				dp[i][0] = costs[i][0] + Math.min(dp[i-1][1] , dp[i-1][2]);
				dp[i][1] = costs[i][1] + Math.min(dp[i-1][0] , dp[i-1][2]);
				dp[i][2] = costs[i][2] + Math.min(dp[i-1][0] , dp[i-1][1]);
			}
		}
		
		
		int ret = Math.min( Math.min(dp[n-1][0], dp[n-1][1]) , dp[n-1][2]); 
		System.out.printf("%d" , ret);
		
		
	}

}
