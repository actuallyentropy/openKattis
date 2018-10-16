package tetris;

import java.util.Scanner;

public class Tetris 
{
    public static int firstCase(int[] cols)
    {
        int solutions = cols.length;
        
        for(int i = 0; i < cols.length - 3; i++)
        {
            if(cols[i] == cols[i + 1] && cols[i] == cols[i + 2] && cols[i] == cols[i + 3])
                    solutions++;
        }
        
        return solutions;
    }
    
    public static int secondCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 0; i < cols.length - 1; i++)
        {
            if(cols[i] == cols[i + 1])
                solutions++;
        }
        
        return solutions;
    }
    
    public static int thirdCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 1; i < cols.length; i++)
        {            
            if(i < cols.length - 1)
            {
                if(cols[i] == cols[i - 1] && cols[i] + 1 == cols[i + 1])
                    solutions++;
            }
            
            if(cols[i] + 1 == cols[i - 1])
                solutions++;
        }
        
        return solutions;
    }
    
    public static int fourthCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 1; i < cols.length; i++)
        {
            if(i < cols.length - 1)
            {
                if(cols[i] == cols[i + 1] && cols[i] + 1 == cols[i - 1])
                    solutions++;
            }
            
            if(cols[i] - 1 == cols[i - 1])
                solutions++;
        }
        
        return solutions;
    }
    
    public static int fifthCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 0; i < cols.length; i++)
        {
            if(i < cols.length - 1)
            {
                if(cols[i] + 1 == cols[i + 1])
                    solutions++;
                
                if(i != 0)
                {
                    if(cols[i - 1] == cols[i + 1] && cols[i] + 1 == cols[i - 1])
                        solutions++;
                    
                    if(cols[i] == cols[i - 1] && cols[i] == cols[i + 1])
                        solutions++;
                }
            }
            
            if(i != 0)
                if(cols[i] + 1 == cols[i - 1])
                    solutions++;
        }
        
        return solutions;
    }
    
    public static int sixthCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 1; i < cols.length; i++)
        {
            if(cols[i] == cols[i - 1])
            {
                solutions++;
                
                if(i < cols.length - 1)
                    if(cols[i] == cols[i + 1])
                        solutions++;
            }
            
            if(i < cols.length - 1)
                if(cols[i] - 1 == cols[i - 1] && cols[i] == cols[i + 1])
                    solutions++;
            
            if(cols[i] + 2 == cols[i - 1])
                solutions++;
        }
        
        return solutions;
    }
    
    public static int seventhCase(int[] cols)
    {
        int solutions = 0;
        
        for(int i = 0; i < cols.length; i++)
        {
            if(i != 0)
            {
                if(cols[i] == cols[i - 1])
                {
                    solutions++;
                
                    if(i < cols.length - 1)
                        if(cols[i] == cols[i + 1])
                            solutions++;
                }
            }
            
            if(i < cols.length - 1)
            {
                if(i != 0)
                    if(cols[i] - 1 == cols[i + 1] && cols[i] == cols[i - 1])
                        solutions++;
                
                if(cols[i] + 2 == cols[i + 1])
                    solutions++;
            }           
        }
        
        return solutions;
    }
    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int numCols = input.nextInt();
       int block = input.nextInt();
       
       int[] cols = new int[numCols];
       
       for(int i = 0; i < numCols; i++)
       {
           cols[i] = input.nextInt();
       }
       
       switch(block)
       {
           case 1: System.out.println(firstCase(cols));
           break;
           case 2: System.out.println(secondCase(cols));
           break;
           case 3: System.out.println(thirdCase(cols));
           break;
           case 4: System.out.println(fourthCase(cols));
           break;
           case 5: System.out.println(fifthCase(cols));
           break;
           case 6: System.out.println(sixthCase(cols));
           break;
           case 7: System.out.println(seventhCase(cols));
           break;
       }
    }
}
