import java.util.Arrays;
import java.util.Scanner;
public class ChessSimul {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String king = scan.next();
		
		int kings[] = new int[2];
		kings[0] = king.charAt(0);
		kings[1] = Integer.parseInt(king.substring(1));
		
		String stone = scan.next();
		
		int stones[] = new int[2];
		stones[0] = stone.charAt(0);
		stones[1] = Integer.parseInt(stone.substring(1));
		
		
		int n = scan.nextInt();
		
		for (int i = 0 ; i < n ; i ++)
		{
			int kingx = kings[0];
			int kingy = kings[1];
			int stonex = stones[0];
			int stoney = stones[1];
			
			String move = scan.next();
			
			if(move.length() == 1)
			{
				
				if(move.equals("R"))
				{
					kingx += 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stonex++;
					}
					
				}
				else if(move.equals("L"))
				{
					kingx -= 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stonex--;
					}
					
				}
				else if(move.equals("B"))
				{
					kingy -= 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stoney--;
					}
				}
				else if(move.equals("T"))
				{
					kingy += 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stoney++;
					}
					
				}
				
				
				
				if(kingx >=65 && kingx<=72 && kingy >=1 && kingy <= 8 && stonex >=65 && stonex<=72 && stoney >=1 && stoney <= 8)
				{
					kings[0] = kingx;
					kings[1] = kingy;
					stones[0] = stonex;
					stones[1] = stoney;
				}
				
				
				
			}
			else
			{
				
				if(move.equals("RT"))
				{
					kingx += 1;
					kingy += 1;
					if(kingx == stonex && kingy == stoney)
					{
						stonex++;
						stoney++;
					}
					
				}
				else if(move.equals("LT"))
				{
					kingx -= 1;
					kingy += 1;
					if(kingx == stonex && kingy == stoney)
					{
						stonex--;
						stoney++;
					}
					
				}
				else if(move.equals("RB"))
				{
					kingx += 1;
					kingy -= 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stonex++;
						stoney--;
					}
				}
				else if(move.equals("LB"))
				{
					kingx -= 1;
					kingy -= 1;
					
					if(kingx == stonex && kingy == stoney)
					{
						stonex--;
						stoney--;
					}
					
				}
				
				
				
				if(kingx >=65 && kingx<=72 && kingy >=1 && kingy <= 8 && stonex >=65 && stonex<=72 && stoney >=1 && stoney <= 8)
				{
					kings[0] = kingx;
					kings[1] = kingy;
					stones[0] = stonex;
					stones[1] = stoney;
				}
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		System.out.printf("%s%d\n%s%d" , (char)kings[0], kings[1] , (char)stones[0] , stones[1]);
		
		
		
		
		
	}
	
	


}
