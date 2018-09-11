package vauvau;

import java.util.Scanner;

public class Vauvau 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt(); 
        int D = input.nextInt();
                
        for(int i = 0; i < 3; i++)
        {
            int worker = input.nextInt();
            worker--;
            
            boolean dog1 = (worker % (A + B)) >= A;
            boolean dog2 = (worker % (C + D)) >= C;
            
            if(dog1 && dog2)
                System.out.println("none");
            else if(!dog1 && !dog2)
                System.out.println("both");
            else
                System.out.println("one");
        }
    }
}
