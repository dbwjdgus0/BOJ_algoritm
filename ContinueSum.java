import java.util.*;

public class ContinueSum {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		
		int n = scan.nextInt();
		int l = scan.nextInt();
	
		if(l > 100)
		{
			System.out.println(-1);
		}
		
		else {
			
		
		
		int soln = 0;
		int soll = 0;
		
		int tempp = 0;
		int k = 1;
		
		while(tempp < n)
		{
			k++;
			tempp = sigma(1, k);
		}
		
		int stopper  = k;
		
		
		
		
		for(int i = l ; i <= 100; i++)
		{
			if(i > stopper)
			{
				break;
			}
			
			for(int j = 1 ; j <= n/2 ; j++)
			{
				int temp = sigma( j , i);
				if(temp == n)
				{
					soln = j;
					soll = i;
					break;
				}
				else if(temp > n)
				{
					break;
				}
			}
			
			if(soln != 0)
			{
				break;
			}
			
		}
		
		
		if(soln == 0)
		{
			System.out.println(-1);
		}
		
		else {
		
		for(int i = soln ; i < soll + soln ; i++)
		{
			System.out.print(i + " ");
		}
		
		}
		
		}
		
		
		
	}
	
	
	
	
	
	
	static int sigma(int k, int n)
	{
		
		int ret = (2 * k + n - 1) * n / 2; /// 시작점이 K 이고 길이가 N 인 연속수의 합
		return ret;
	}


}
