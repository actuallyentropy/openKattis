package quiteaproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuiteAProblem 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           String line = input.readLine();
           
           if(line == null)
               break;
           
           line = line.toLowerCase();
           if(line.contains("problem"))
               System.out.println("yes");
           else
               System.out.println("no");
       }
    }
}
