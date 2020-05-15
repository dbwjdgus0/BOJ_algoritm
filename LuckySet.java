import java.util.Scanner;
import java.util.Arrays;
public class LuckySet {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int lucky[] = new int[n];
		
		for(int i = 0 ; i < n ; i ++)
		{
			lucky[i] = scan.nextInt();
		}
		
		
		Arrays.sort(lucky);
		
		
		int unl = scan.nextInt();
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < n; i ++)
		{
			if(lucky[i] < unl)
			{
				min = lucky[i];
			}
			else if(lucky[i] > unl)
			{
				max = lucky[i];
				break;
			}
			
		}
		
		
		int sol =  0 ;
		
		
			
			
			
			
		
		
		System.out.printf("%d" , sol);
		
		
		
		
	}

}
