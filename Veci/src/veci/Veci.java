package veci;

import java.util.Scanner;

public class Veci 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        StringBuilder num = new StringBuilder(input.nextLine());
        
        boolean foundSolution = false;        
        
        for(int i = num.length() - 1; i > 0; i--)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                if(num.charAt(i) > num.charAt(j))
                {
                    foundSolution = true;
                    char temp = num.charAt(i);
                    num.setCharAt(i, num.charAt(j));
                    num.setCharAt(j, temp);
                                                            
                    for(int k = j+1; k < num.length() - 1; k++)
                    {                        
                        if(num.charAt(k) > num.charAt(k+1))
                        {
                            temp = num.charAt(k);
                            num.setCharAt(k, num.charAt(k+1));
                            num.setCharAt(k+1, temp);
                            k = j;
                        }
                    }                   
                }
                
                if(foundSolution)
                    break;
            }
            if(foundSolution)
                break;            
        }
        
        if(foundSolution)
            System.out.println(num);
        else
            System.out.println("0");
    }
}
