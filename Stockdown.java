
public class Stockdown {

	public static void main(String[] args) {
		
		int[] prices = {5, 6, 7, 3, 8};
		int n = prices.length;
		
		int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = i+1; j < answer.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j-i;
                    break;
                }
                if (j==answer.length-1) answer[i] = j-i;
            }
        }
		
		for(int i =0 ; i < n; i++)
		{
			System.out.println(answer[i]);
		}

	}
}
