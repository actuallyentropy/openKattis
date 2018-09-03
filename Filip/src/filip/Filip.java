/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filip;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class Filip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstNum = input.next();
        String secondNum = input.next();
        
        String reverseFirst = "";
        
        for(int i = firstNum.length() - 1; i >= 0; i--)
        {
            reverseFirst += firstNum.charAt(i);
        }
        
        String reverseSecond = "";
        
        for(int i = secondNum.length() - 1; i >= 0; i--)
        {
            reverseSecond += secondNum.charAt(i);
        }
        
        String larger;
        
        if(reverseFirst.compareTo(reverseSecond) > 0)
        {
            larger = reverseFirst;
        }else
        {
            larger = reverseSecond;
        }
                
        System.out.println(larger);
    }
    
}
