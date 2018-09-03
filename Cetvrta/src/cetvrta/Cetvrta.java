/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetvrta;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Cetvrta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int xLow = 9999;
        int xHigh = 0;
        int yLow = 9999;
        int yHigh = 0;
        
        boolean[][] graph = new boolean[1000][1000];
        
        for(int i = 0; i < 3; i++)
        {
            int x = input.nextInt();
            int y = input.nextInt();
            
            graph[x][y] = true;
            
            if(x > xHigh)
            {
                xHigh = x;
            }
            
            if(x < xLow)
            {
                xLow = x;
            }
            
            if(y > yHigh)
            {
                yHigh = y;
            }
            
            if(y < yLow)
            {
                yLow = y;
            }
        }
        
        if(!graph[xLow][yLow])
        {
            System.out.println(xLow + " " + yLow);
            return;
        }
        
        if(!graph[xHigh][yLow])
        {
            System.out.println(xHigh + " " + yLow);
            return;
        }
        
        if(!graph[xLow][yHigh])
        {
            System.out.println(xLow + " " + yHigh);
            return;
        }
        
        if(!graph[xHigh][yHigh])
        {
            System.out.println(xHigh + " " + yHigh);
            return;
        }
    }
    
}
