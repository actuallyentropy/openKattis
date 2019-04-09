package delimitersoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DelimiterSoup 
{
    public static void main(String[] args) throws IOException 
    {
       Stack<Character> openings = new Stack<>();
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       input.readLine();
       String data = input.readLine();
       
       for(int i = 0; i < data.length(); i++)
       {
           if(data.charAt(i) == ' ')
               continue;
           
           if(data.charAt(i) == '(' || data.charAt(i) == '[' || data.charAt(i) == '{')
               openings.push(data.charAt(i));
           
           if(data.charAt(i) == ')')
           {
               if(openings.size() == 0 || openings.peek() != '(')
               {
                   System.out.print(") " + i);
                   return;
               }
               
               openings.pop();
           }
           
           if(data.charAt(i) == ']')
           {
               if(openings.size() == 0 || openings.peek() != '[')
               {
                   System.out.print("] " + i);
                   return;
               }
               
               openings.pop();
           }
           
           if(data.charAt(i) == '}')
           {
               if(openings.size() == 0 || openings.peek() != '{')
               {
                   System.out.print("} " + i);
                   return;
               }
               
               openings.pop();
           }
       }
       
       System.out.println("ok so far");
    }
}
