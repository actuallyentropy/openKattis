package maptiles2;

import java.util.Scanner;

public class MapTiles2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        int modifier = (int)Math.pow(2, s.length() - 1);
        
        int x = 0;
        int y = 0;
 
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '1' || s.charAt(i) == '3')
                x += modifier;
            
            if(s.charAt(i) == '2' || s.charAt(i) == '3')
                y += modifier;
            
            modifier = modifier / 2;
        }
        
        System.out.println(s.length() + " " + x + " " + y);
    }
}
