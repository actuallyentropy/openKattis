package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int friendCorrect = Integer.parseInt(input.readLine());
       String myAnswers = input.readLine();
       String friendAnswers = input.readLine();
       int same = 0;
       
       for(int i = 0; i < myAnswers.length(); i++)
       {
           if(myAnswers.charAt(i) == friendAnswers.charAt(i))
               same++;
       }
       
       if(same > friendCorrect)
       {
           System.out.println(myAnswers.length() - (same - friendCorrect));
       }else
       {
           System.out.println(same + (myAnswers.length() - friendCorrect));
       }
    }
}
