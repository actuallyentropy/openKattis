package easiest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Easiest 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            String data = input.readLine();
            
            if(data.equals("0"))
            {
                break;
            }
            
            int goal = 0;
            
            for(int i = 0; i < data.length(); i++)
            {
                goal += Integer.parseInt(Character.toString(data.charAt(i)));
            }
            
            for(int i = 11; i < 100000; i++)
            {
                long mul = i * Long.parseLong(data);
                String mulString = Long.toString(mul);
                
                int total = 0;
                
                for(int j = 0; j < mulString.length(); j++)
                {
                    total += Integer.parseInt(Character.toString(mulString.charAt(j)));
                }
                
                if(total == goal)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    
}
