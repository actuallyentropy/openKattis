package set;

import java.util.Scanner;

public class Set 
{
    public static boolean good(String first, String second, String third)
    {
        int similar = 0;
        int different = 0;
        
        for(int i = 0; i < 4; i++)
        {
            if(first.charAt(i) == second.charAt(i) && second.charAt(i) == third.charAt(i))
                similar++;
            else if(first.charAt(i) != second.charAt(i) && second.charAt(i) != third.charAt(i) && first.charAt(i) != third.charAt(i))
                different++;
        }
        
        return similar + different == 4;
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String[] cards = new String[12];
        boolean matchFound = false;
        
        for(int i = 0; i < 12; i++)
        {
            cards[i] = input.next();         
        }
        
        for(int i = 0; i < 12; i++)
        {
            for(int j = i+1; j < 12; j++)
            {
                for(int k = j+1; k < 12; k++)
                {                                     
                    if(good(cards[i], cards[j], cards[k]))
                    {
                        System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                        matchFound = true;
                    }
                }
            }
        }
        
        if(!matchFound)
        {
            System.out.println("no sets");
        }
    }
}
