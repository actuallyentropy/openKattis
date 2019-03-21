package yoda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yoda 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String firstBase = input.readLine();
       String secondBase = input.readLine();
       String firstResult = "";
       String secondResult = "";
       
       if(firstBase.length() > secondBase.length())
       {
           int dif = firstBase.length() - secondBase.length();
           String revised = "";
           
           for(int i = 0; i < dif; i++)
           {
               revised += ".";
           }
           
           revised += secondBase;
           secondBase = revised;
       }else if(secondBase.length() > firstBase.length())
       {
           int dif = secondBase.length() - firstBase.length();
           String revised = "";
           
           for(int i = 0; i < dif; i++)
           {
               revised += "0";
           }
           
           revised += firstBase;
           firstBase = revised;
       }
       
       for(int i = 0; i < firstBase.length() || i < secondBase.length(); i++)
       {        
           if(firstBase.charAt(i) < secondBase.charAt(i))
           {
               secondResult += secondBase.charAt(i);                   
           }else if(secondBase.charAt(i) < firstBase.charAt(i))
           {
               firstResult += firstBase.charAt(i);
           }else
           {
               firstResult += firstBase.charAt(i);
               secondResult += secondBase.charAt(i);
           }
       }
       
       if(firstResult.length() == 0)
           System.out.println("YODA");
       else
           System.out.println(Integer.parseInt(firstResult));
       
       if(secondResult.length() == 0)
           System.out.println("YODA");
       else
           System.out.println(Integer.parseInt(secondResult));
    }
}
