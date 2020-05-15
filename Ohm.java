import java.util.*;

public class Ohm {

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		
		String in1 = scan.nextLine();
		String in2 = scan.nextLine();
		String in3 = scan.nextLine();
		
		String inn[] = { in1, in2 };
		
		int sol = 0;
		
		String colors[] = { "black" , "brown" , "red" , 
						"orange" , "yellow", "green" ,
						"blue" , "violet", "grey" ,"white"};
		
		
		for(int i = 0 ; i < 2; i++)
		{
			String temp = inn[i];
			
			
			for(int j = 0; j < 10; j++)
			{
				if(temp.equals(colors[j]))
				{
					if(i == 0)
					{
						sol += j * 10;
					}
					else
					{
						sol += j;
					}
				}
			}
			
		}
		
		
		if(sol == 0)
		{
			System.out.println(0);
		}
		
		else {
		
		String ret = Integer.toString(sol);
		
		
		for(int i = 0 ; i < 10; i++)
		{
				if(in3.equals(colors[i]))
				{
					for(int j = 0 ; j < i ; j++)
					{
						ret += "0";
					}
				}
		}
		
		
		
		System.out.println(ret);
		}
		
	}
}
