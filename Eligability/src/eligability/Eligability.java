package eligability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eligability 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(input.readLine());
        
        for(int i = 0; i < numCases; i++)
        {
            String[] data = input.readLine().split(" ");
            if(Integer.parseInt(data[1].substring(0,4)) >= 2010)
            {
                System.out.println(data[0] + " eligible");
            }else if(Integer.parseInt(data[2].substring(0,4)) >= 1991)
            {
                System.out.println(data[0] + " eligible");
            }else if (Integer.parseInt(data[3]) > 40)
            {
                System.out.println(data[0] + " ineligible");
            }else
            {
                System.out.println(data[0] + " coach petitions");
            }
        }
    }
}
