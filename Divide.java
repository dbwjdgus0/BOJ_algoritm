import java.util.*;

public class Divide{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        a = a % b;
        
        for(int i = 0 ; i < n-1 ; i ++)
        {
            a *= 10;
            a %= b;
        }
        
        a *= 10;
        a = a / b;
        
        System.out.println(a);
        
        
    }

}