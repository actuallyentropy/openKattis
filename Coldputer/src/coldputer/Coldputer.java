
package coldputer;

import java.util.Scanner;

public class Coldputer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int numTemps = input.nextInt();
        
        int numNeg = 0;
        
        for(int i = 0; i < numTemps; i++)
        {
            int temp = input.nextInt();
            
            if(temp < 0)
                numNeg++;
        }
        
        System.out.println(numNeg);
    }
    
}
