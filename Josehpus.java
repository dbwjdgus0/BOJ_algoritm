import java.util.Scanner;
public class Josehpus {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int arr[] = new int[n+1];
		int sol[] = new int[n];
		for(int i = 1 ; i <=n ; i++)
		{
			arr[i] = i;
		}
		
		arr[0] = 1;
		
		int cnt = 0;
		
		int now = 0;
		
		
		while(cnt != n)
		{
			int temp = k;
			while(temp != 0)
			{
				
				
				now++;
				temp--;
				
				if(now > n)
				{
					now = now - n;
				}
				
				
				if(arr[now] == 0)
				{
					temp++;
				}
				
		
	
				
				
				
			}
			
			sol[cnt] = arr[now];
			arr[now] = 0;
			cnt++;
			
		}
		
		if(n == 1)
		{
			System.out.printf("<1>");
		}
		else
		{
		for(int i = 0 ; i < n; i++)
		{
			if(i == 0)
			{
			System.out.printf("<%d, ", sol[i]);
			}
			else if(i == n-1)
			{
				System.out.printf("%d>", sol[i]);
			}
			else
			{
				System.out.printf("%d, ", sol[i]);
			}
				
		}
		}
		
		
		
		
		
		
		
	}

}
