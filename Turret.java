import java.util.*;

public class Turret {
	
	public static void main(String[] argss)
	{
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int test = 0 ; test < t ; test++) {
		int arr1[] = new int[2];
		int arr2[] = new int[2];
		
		arr1[0] = scan.nextInt();
		arr1[1] = scan.nextInt();
 		int r1 = scan.nextInt();
 		
 		arr2[0] = scan.nextInt();
		arr2[1] = scan.nextInt();
 		int r2 = scan.nextInt();
 		
 		
 		int sol = 0;
 	
 		
 		double dis = Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1] , 2);
 	
 		
 		if(dis == 0)
 		{
 			if( r1 == r2)
 			{
 				sol = -1;
 			}
 			else
 			{
 				sol = 0;
 			}
 		}
 		else if(dis > (r1 + r2) * (r1 + r2)|| dis < (r1 - r2) * (r1 - r2) )
 		{
 			sol = 0;
 		}
 		else if(dis == (r1 + r2) * (r1 + r2) || dis == (r1 - r2) * (r1 - r2) )
 		{
 			sol = 1;
 		}
 		else 
 		{
 			sol = 2;
 		}
 		
 		System.out.println(sol);
 		
 		
 		
 		
		}
	}
}
