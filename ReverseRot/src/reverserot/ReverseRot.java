package reverserot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseRot 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        
        while(true)
        {
            String[] data = input.readLine().split(" ");
            if(data[0].equals("0"))
                break;
            
            String reverse = new StringBuilder(data[1]).reverse().toString();
            
            String result = "";
            
            for(int i = 0; i < data[1].length(); i++)
            {
                result += key.charAt((key.indexOf(reverse.charAt(i)) + Integer.parseInt(data[0])) % key.length());
            }
            
            System.out.println(result);
        }
    }    
}
