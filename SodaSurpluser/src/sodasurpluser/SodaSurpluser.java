package sodasurpluser;

import java.util.Scanner;

/**
 *
 * @author Lexie
 */
public class SodaSurpluser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int curr = input.nextInt();
        curr += input.nextInt();
        int cost = input.nextInt();
        int total = 0;
        
        while(curr >= cost)
        {
            total += curr / cost;
            curr = (curr / cost) + (curr % cost);
        }
        
        System.out.println(total);
    }
    
}
