import java.util.*;
public class BinaryWatch {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String no = scan.nextLine();
		
		for(int i = 0 ; i < n ; i++)
		{
			String inn = scan.nextLine();
			
			String arr[] = inn.split(":");
			
			char arr2[][] = new char[6][3];
	
			
			for(int j = 0 ; j < 3 ; j++)
			{
				
				
				
				
				String bin = Integer.toBinaryString(Integer.parseInt(arr[j]));
				int len = bin.length();
				if( len < 6)
				{
					for(int zero  = 0 ; zero < 6 - len ; zero++)
					{
						bin = "0" + bin;
					}
				}
				
				for(int w = 0 ; w < 6 ; w ++)
				{
					arr2[w][j] = bin.charAt(w);
				}
					
				
			}
			
			for(int j = 0;  j <6 ; j++)
			{
				for(int w = 0 ; w < 3 ; w++)
				{
					System.out.print(arr2[j][w]);
				}
			}
			
			System.out.print(" ");
			
			for(int j = 0;  j <3 ; j++)
			{
				for(int w = 0 ; w < 6 ; w++)
				{
					System.out.print(arr2[w][j]);
				}
			}
			
			System.out.println("");
			
		}
	}
}
