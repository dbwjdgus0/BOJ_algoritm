import java.util.*;
public class EggSeller {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int egg = scan.nextInt();
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		int max = 0;
		int min = 9999999;
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = scan.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			

		}
		
		int sol = 0 ;
		int solprice = 0;
		
		for(int price = 1 ; price <= max ; price++ )
		{
			int tempegg = egg;
			int tempsol = 0;
			
			for(int i = 0 ; i < n ; i++)
			{
				int temp = arr[i] ;
					
				if(tempegg == 0)
				{
					break;
				}
				
				if(temp >= price )
				{
					tempegg--;
					tempsol += price;
				}

			}
			
			if(sol < tempsol)
			{
				sol = tempsol;
				solprice = price;
			}
			else if(sol == tempsol)
			{
				solprice = Math.min(solprice, price);
			}
			
			
			
		}
		
		System.out.printf("%d %d", solprice, sol);
		
		
	}
}
