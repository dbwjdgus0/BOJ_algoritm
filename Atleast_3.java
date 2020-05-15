import java.util.Scanner;
import java.util.Arrays;
public class Atleast_3 {
	
	
	
	public static int gcdlcm(int a , int b)
	{
		if(a > b)
		{
			int temp = a ;
			a = b;
			b = temp;
			
		}
		
		int ans = a * b;
		
		int helper = 1 ;
		
		while(helper != 0)
		{
			helper = b % a ;
			b = a;
			a = helper;
		}
		ans = ans / b;
		return ans;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0 ; i < 5; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		int min = 999999999 ;
		
		
		for(int i = 0 ; i <5; i ++)
		{
			int temp_i = arr[i];
			
			for(int j = i+1 ; j <5 ; j++)
			{
				int temp_j = arr[j];
				int c = gcdlcm(temp_i , temp_j);
				
				for(int w = j+1 ; w < 5 ; w ++)
				{
					
					int temp_w = arr[w];
					
					int d = gcdlcm(c , temp_w);
					
					if(d < min)
					{
						min = d;
			
					}
					
				}
					
			}
		
		}
		
		System.out.printf("%d", min);
		
		
	}

}
