package volim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volim 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(input.readLine());
        int numQuestion = Integer.parseInt(input.readLine());
       
        int time = 210;
        
        for(int i = 0; i < numQuestion; i++)
        {
            String[] data = input.readLine().split(" ");
            
            time -= Integer.parseInt(data[0]);
            
            if(time <= 0)
                break;
            
            if(data[1].equals("T"))
                start++;
            
            if(start == 9)
                start = 1;
        }
        
        System.out.println(start);
    }
}
