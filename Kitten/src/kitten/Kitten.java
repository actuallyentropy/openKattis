package kitten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kitten 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] branches = new int[100];
        int branch = Integer.parseInt(input.readLine());
        
        while(true)
        {
            String[] values = input.readLine().split(" ");
            
            if(values[0].equals("-1"))
                break;
            
            for(int i = 1; i < values.length; i++)
            {
                branches[Integer.parseInt(values[i]) - 1] = Integer.parseInt(values[0]);
            }
        }
        
        System.out.println(branch);
        
        while(branches[branch-1] != 0)
        {
            branch = branches[branch - 1];
            System.out.println(branch);
        }
    }
}
