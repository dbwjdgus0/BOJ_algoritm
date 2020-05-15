import java.util.Scanner;
public class MagicStick {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int jimin = 64;
		int cnt = 1;
		int sum = 64;
		int last;
		
		if(n == 64)
		{
			System.out.println(1);
		}
		else {
		while(n != 0)
		{
			int half = jimin /2;
			
			
			
			if(sum - half > n)
			{
				sum -= half;
			}
			else if(sum - half == n)
			{
				break;
			}
			else
			{
				cnt++;
			}
			
			jimin = half;
			
			
			
			
			
			
			
		}
		
		
		
		System.out.println(cnt);
		
		}
		
	}
}
