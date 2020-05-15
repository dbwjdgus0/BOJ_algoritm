import java.util.*;
public class SumCycle {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sol = 0;
		int cycle = 0;
		if(n == 0)
		{
			cycle = 1;
		}
		else {
		while(sol != n )
		{
			cycle++;
			
			if(sol == 0)
			{
				sol = doCycle(n);
			}
			
			else
			{
				sol = doCycle(sol);
			}
			
		}
		
		}
		
		System.out.println(cycle);
		
	
		
	}
	

	public static int doCycle(int a)
	{
		int temp10 = a / 10;
		int temp01 = a % 10;
		
		int temp = temp10 + temp01;
		
		int newint = temp01 * 10;
		newint += temp % 10;
		
		return newint;
	}
}
