import java.util.*;

public class ConSum2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		int pointer = 0;
		
		if(l > 100)
		{
			System.out.println(-1);
		}
		else if(n == 1 || n ==2)
		{
			System.out.println(-1);
		}
		else
		{
			
			for(int i = l ; i <=100; i++)
			{
				int temp = n - ( i * ( i + 1 ) /2 ) ;
				
				
				
				if(temp % i == 0 && temp / i > 0)
				{
					int j = temp / i + 1;
					if(j >= 0)
					{
					pointer = 1;
					
					for( int k = 0 ; k < i ; k++ )
					{
						int a = k + j;
						System.out.print(a + " ");
					}
					
					break;
					}
				}
				
			}
			

			
			if(pointer == 0)
			{
				System.out.println(-1);
			}
			
			
		}
		
		
	}
}
