import java.util.*;
public class Olympic {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m+1][3];
		
		for(int i = 0 ; i < m ; i++)
		{
			int ctry = sc.nextInt();
			arr[ctry][0] = sc.nextInt();
			arr[ctry][1] = sc.nextInt();
			arr[ctry][2] = sc.nextInt();
		}
		
		int score = 1;
		
		for(int i = 1 ; i <= m ; i++)
		{
			if(arr[i][0] > arr[n][0]) score++;
			
			else if(arr[i][0] == arr[n][0])
			{
				if(arr[i][1] > arr[n][1]) score++;
				else if(arr[i][1] == arr[n][1])
				{
					if(arr[i][2] > arr[n][2]) score++;
				}
			}
				
		}
		
		System.out.println(score);
		
		
		
		
		
	}

}
