import java.util.Stack;
public class Lasor {

	  static public int solution(String arrangement) {
	        int answer = 0;
	
	        Stack<Character> st = new Stack<Character>();
	        
	        for(int i = 0; i < arrangement.length() ; i++)
	        {
	        	char temp = arrangement.charAt(i);
	        	if(temp == '(')
	        	{
	        		if(arrangement.charAt(i+1) == ')')
	        		{
	        			///lasor
	        			answer += st.size();
	        			i++;
	        		}
	        		else
	        		{
	        			st.push(temp);
	        			answer++;
	        		}
	        	}
	        	else
	        	{
	        		st.pop();
	        	}
	        	
	        	
	        }
	        
	        
	        
	        
	        return answer;	        
	    }
	  
    public static void main(String[] args) {
    	
    	
    	int a = solution("()(((()())(())()))(())") ;
    	
    	System.out.println(a);
    	
	}
}