
public class Treebattle {
	
	public static void main(String[] args) {
		
		int n = 16;
		int a = 4;
		int b = 7;
		
		int sol; 
		
		int num = (int) Math.log((double)n);
	
		
		for(int i = 1 ; i < 21 ; i++)
		{
			int two = (int)Math.pow(2, i);
			
			int tempa = (a - 1) / two;
			int tempb = (b - 1) / two;
			
			if(tempa == tempb) sol = i; 
			
		}
		
		
	}
}
