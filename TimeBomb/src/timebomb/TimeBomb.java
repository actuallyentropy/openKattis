package timebomb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TimeBomb
{
    public static void main(String[] args) throws IOException 
    {
        String[] nums = {"**** ** ** ****", "  *  *  *  *  *", "***  *****  ***", "***  ****  ****", "* ** ****  *  *",
            "****  ***  ****", "****  **** ****", "***  *  *  *  *", "**** ***** ****", "**** ****  ****"}; 
        
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] raw = new String[5];
        String value = "";
        
        for(int i = 0; i < 5; i++)
        {
            String line = input.readLine();
            raw[i] = line;
        }
        
        for(int i = 0; i < raw[0].length(); i += 4)
        {
            String digit = "";
            for(int j = 0; j < 5; j++)
            {
                digit += "" + (raw[j].charAt(i)) + "" + raw[j].charAt(i+1) + "" + raw[j].charAt(i+2);
            }
            
            if(Arrays.asList(nums).contains(digit))
            {
                value += "" + Arrays.asList(nums).indexOf(digit);
            }else
            {
                System.out.println("BOOM!!");
                return;
            }
        }
                
        
        int val = Integer.parseInt(value);
        if(val % 6 == 0)
        {
            System.out.println("BEER!!");
        }else
        {
            System.out.println("BOOM!!");
        }
    }  
}
