import java.util.Scanner;
import java.util.Arrays;
public class Parrallelsq {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		
			int a[] = new int[2];
			int b[] = new int[2];
			int c[] = new int[2];
			
			a[0] = scan.nextInt();
			a[1] = scan.nextInt();
			b[0] = scan.nextInt();
			b[1] = scan.nextInt();
			c[0] = scan.nextInt();
			c[1] = scan.nextInt();
			
			
			if( (a[1] - b[1]) * (a[0] - c[0]) == (a[0] - b[0]) * (a[1] - c[1]) )
			{
				System.out.println(-1);
			}
			
			else
			{
				
				
				
				int d[][] = new int[3][2];
				
				d[0][0] = a[0] + b[0] - c[0];
				d[0][1] = a[1] + b[1] - c[1];  
				
				d[1][0] = b[0] + c[0] - a[0];
				d[1][1] = b[1] + c[1] - a[1];
				
				d[2][0] = a[0] + c[0] - b[0];
				d[2][1] = a[1] + c[1] - b[1];
				
				
				double max = 0;
				double min = 999999999;
				for(int j = 0; j <=2 ; j++)
				{
					double temp = 0;
					
					double dis_1 ;
					double dis_2 ;
					
					if(j == 0)
					{
						dis_1 = Math.pow(d[j][0] - a[0], 2) + Math.pow(d[j][1] - a[1], 2);
						
						dis_1 = Math.sqrt(dis_1);
						
						dis_2 = Math.pow(d[j][0] - b[0], 2) + Math.pow(d[j][1] - b[1], 2);
					
						dis_2 = Math.sqrt(dis_2);
						
						
						temp = (dis_1 + dis_2)*2;
	
						
						
					}
					else if(j == 1)
					{
						
						dis_1 = Math.pow(d[j][0] - c[0], 2) + Math.pow(d[j][1] - c[1], 2);
							
						dis_1 = Math.sqrt(dis_1);
							
						dis_2 = Math.pow(d[j][0] - b[0], 2) + Math.pow(d[j][1] - b[1], 2);
						
						dis_2 = Math.sqrt(dis_2);
						
						temp = (dis_1 + dis_2)*2;
					}
					else
					{
						dis_1 = Math.pow(d[j][0] - a[0], 2) + Math.pow(d[j][1] - a[1], 2);
						
						dis_1 = Math.sqrt(dis_1);
						
						dis_2 = Math.pow(d[j][0] - c[0], 2) + Math.pow(d[j][1] - c[1], 2);
					
						dis_2 = Math.sqrt(dis_2);
						
						temp = (dis_1 + dis_2)*2;
					}
					
					
					if(temp > max)
					{
						max = temp;
					}
					
					if(temp < min)
					{
						min = temp;
					}
					
					
				}
				
			
				
				
				
				System.out.println(max-min);
				
				
			}
			
			
			
			
			
		
		
		
	}

}
