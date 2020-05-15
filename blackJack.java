import java.util.*;

public class blackJack {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i ++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0 ; i < n ; i ++)
		{
			for(int j = i+1 ; j < n ; j++)
			{
				for(int w = j+1 ; w < n; w++)
				{
					int temp = arr[i] + arr[j] + arr[w];
					
					
					
					if(m -temp >= 0)
					{
						max = Math.max(max, temp);
						
						
						
						
					}
					
					
					
				}
			}
		}
		
		
		System.out.println(max);
		
		
		
		
	}

}
