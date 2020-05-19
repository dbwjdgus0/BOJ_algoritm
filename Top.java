import java.util.Arrays;
import java.util.Stack;

class Top {
    public static int[] solution(int[] heights) {
        
        int n = heights.length;
        
        int[] answer = new int[n];
       
        for(int i = n-1 ; i >= 0; i--)
        {
        	int now = heights[i];
        	
        	int ret = 0;
        	
        	for(int j = i-1 ; j >=0; j--)
        	{
        		if(heights[j] > now)
        		{
        			ret = j+1;
        			break;
        		}
        	}
        	
        	answer[i] = ret;
        	
        }
        
        
        
        
        
        return answer;
    }
    
    
    public static void main(String[] args) {
		
    	int[] input = {6, 9, 5, 7, 4};
    	
    	int output[] = solution(input);
    	
    	System.out.println(Arrays.toString(output));;
    	
	}
}