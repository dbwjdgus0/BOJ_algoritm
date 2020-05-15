import java.util.*;

public class Numer74 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int sol = 0;

		int n = Integer.toString(k).length();
		
		for(int i =k ; i <= k  ; i++)
		{
			if(isminsu(i))
			{
				sol = i;
			}
		}
		
		
		System.out.println(sol);
	}
	
	static boolean isminsu(int n)
	{
		boolean ret = true;
		while(n > 0)
		{
			int temp = n % 10;
			n = n / 10;
			if(temp == 4 || temp == 7)
			{
				continue;
			}
			else
			{
				ret = false;
				break;
			}
		}
		return ret;
	}
	
	
}
