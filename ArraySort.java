import java.util.*;
public class ArraySort {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int p[] = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		int b[] = Arrays.copyOf(arr , n);
		Arrays.sort(b);
		
		for(int i = 0 ; i < n ; i ++)
		{
			
			int temp = b[i]; //// B[ p[i] ] 의 값
		
			int sch = -1; /// 같은 값을 가지는 A의 index
		
			for (int j = 0; j < n; j++)
			{
			      if (temp == arr[j]) 
			      {
			    	  
			    	  if(sch != -1)
			    	  {
			    		 sch = Math.min(sch, j); 
			    	  }
			    	  else {
			          sch = j;
			    	  }
			    	  
			      }            
			
		    }   
			
			arr[sch] = 0;
			p[sch] = i ;
			
		
		}
		
		
		for(int i = 0 ; i < n ; i ++)
		{
			System.out.printf("%d ", p[i]);
		}
		
		
		
	}
}
 