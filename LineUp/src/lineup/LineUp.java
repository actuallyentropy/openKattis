package lineup;

import java.util.Scanner;

public class LineUp 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numNames = input.nextInt();
        int increasing = 0;
        int decreasing = 0;
        String[] names = new String[numNames];
        
        input.nextLine(); //clear buffer
        
        for(int i = 0; i < numNames; i++)
        {
            names[i] = input.nextLine();
        }
        
        for(int i = 0; i < numNames - 1; i++)
        {
            if(names[i].compareTo(names[i+1]) < 0)
                increasing++;
            else
                decreasing++;
        }
        
        if(increasing != 0 && decreasing != 0)
            System.out.println("NEITHER");
        else if(increasing != 0)
            System.out.println("INCREASING");
        else
            System.out.println("DECREASING");
    }
}
