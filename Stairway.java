import java.util.Arrays;
import java.util.Scanner;
public class Stairway {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i  = 0 ; i < n ; i++ )
		{
			arr[i] = scan.nextInt();
			
		}
		
		
		int dp[] = new int[n];
		

		dp[0] = arr[0];
	
		dp[1] = arr[0] + arr[1];
		
		dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);
		
		
		for(int i = 3 ; i < n ; i++)
		{
			int temp = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
			dp[i] = temp;
			
			
		}
		
		 
		
		System.out.printf("%d", dp[n-1]);
		
	}
	
}
