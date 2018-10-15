package runlengthencodingrun;

import java.util.Scanner;

public class RunLengthEncodingRun 
{
    public static void encode(String data)
    {
        String encoded = "";
        char curr = data.charAt(0);
        int count = 0;
        
        for(int i = 0; i < data.length(); i++)
        {
            if(curr == data.charAt(i))
                count++;
            else
            {
                encoded += curr;
                encoded += count;
                curr = data.charAt(i);
                count = 1;
            }
        }
        
        encoded += curr;
        encoded += count;
        
        System.out.println(encoded);
    }
    
    public static void decode(String data)
    {
        for(int i = 0; i < data.length(); i+= 2)
        {
            char curr = data.charAt(i);
            
            for(int j = 0; j < Integer.parseInt(data.substring(i+1, i+2)); j++)
                System.out.print(curr);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char mode = input.next().charAt(0);
        String data = input.next();
        
        if(mode == 'E')
            encode(data);
        else
            decode(data);
    }
    
}
