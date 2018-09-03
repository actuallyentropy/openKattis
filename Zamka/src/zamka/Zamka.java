/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zamka;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Zamka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int min = input.nextInt();
        int max = input.nextInt();
        int goal = input.nextInt();
        
        /*
        int minDigits = (int)Math.ceil((double)goal / 9.0);
        if(Integer.toString(min).length() > minDigits)
        {
            minDigits = Integer.toString(min).length();
        }
                
        int lowTotal = 0;
        //int minGoal = goal;
        
        
        for(int i = 0; i < minDigits; i++)
        {
            if(minGoal > 9)
            {
                lowTotal += 9 * Math.pow(10, i);
                minGoal -= 9;
            }else
            {
                for(int j = 0, k = minGoal; j <= 9; j++, k--)
                {
                    if((lowTotal + (k * Math.pow(10, i)) + (j * Math.pow(10, i+1))) >= min)
                    {
                        lowTotal += (k * Math.pow(10, i)) + (j * Math.pow(10, i+1));
                        i++;
                        break;
                    }
                }
            }
        }
        */
        
        int lowTotal = min;
        while(true)
        {
            int counter = 0;
            
             for(int i = 0; i < Integer.toString(lowTotal).length(); i++)
            {
                counter += Integer.parseInt(Character.toString(Integer.toString(lowTotal).charAt(i)));
            }
             
             if(counter == goal)
             {
                 break;
             }else
             {
                 lowTotal++;
             }
        }
        
        int highTotal = max;
        
        while(true)
        {
            int counter = 0;
            for(int i = 0; i < Integer.toString(highTotal).length(); i++)
            {
                counter += Integer.parseInt(Character.toString(Integer.toString(highTotal).charAt(i)));
            }
            
            if(counter == goal)
            {
                break;
            }else
            {
                highTotal--;
            }
        }
        
        System.out.println(lowTotal);
        System.out.println(highTotal);
    }
    
}
