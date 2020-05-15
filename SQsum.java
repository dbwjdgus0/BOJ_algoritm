import java.util.Scanner;

public class SQsum {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int dp[] = new int[n+1];
		
		for(int i = 1 ; i <= n ; i++)
		{
			double a = Math.sqrt(i);
			
			
			if( Math.pow( (int)a , 2 ) == Math.pow(a , 2)  )
			{
				dp[i] = 1;
			}
			
			
			else
			{
				int rtt = (int)a;
				int min = 999999999;
				for(int j = 1 ; j <= rtt ; j++)
				{
					int temp = i - (int)Math.pow(j , 2);
					if(dp[temp] < min)
					{
						min = dp[temp];
					}
					
				}
				
				dp[i] = min + 1;
				
			}
			
		}
		
		
		
		System.out.printf("%d", dp[n]);
		
	}

}
