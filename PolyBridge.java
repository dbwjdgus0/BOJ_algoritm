import java.util.Scanner;
public class PolyBridge {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int inputs[][] = new int[t][2];
	
		for(int i = 0 ; i < t ; i ++)
		{
			inputs[i][0] = sc.nextInt();
			inputs[i][1] = sc.nextInt();
		}   ///입력
		
		for(int i = 0 ; i < t ; i ++)  //test case 반복
		{
			
			
			
			int n = inputs[i][0];
			int m = inputs[i][1];
			
			int dp[][] = new int[n+1][m+1]; 
			
			
			
			
			for(int j = 1  ; j <= n ; j++)  //Dp 구하기
			{
				
				for(int w = 1 ; w <= m; w++)
				{
					if(j == 1)
					{
						dp[j][w] = w;
					}
					else if(w == j)
					{
						dp[j][w] = 1;
					}
					else
					{
						dp[j][w] = dp[j][w-1] + dp[j-1][w-1];
					}
				
				}
			
				
			}
			
			
			System.out.printf("%d\n", dp[n][m]);
			
			
		}
		
		
		
		
	}

}
