package patuljci;

import java.util.Scanner;

public class Patuljci 
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int[] dwarves = new int[9];
        
        for(int i = 0; i < 9; i++)
        {
            dwarves[i] = input.nextInt();
        }
        
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                int count = 0;
                
                if(j != i)
                {
                    for(int k = 0; k < 9; k++)
                    {
                    
                        if(k != i && k != j)
                            count += dwarves[k];
                    }

                    if(count == 100)
                    {
                        for(int k = 0; k < 9; k++)
                        {
                            if(k != i && k != j)
                            {
                                System.out.println(dwarves[k]);
                            }
                        }
                        
                        return;
                    }
                }
            }
        }
    }
}
