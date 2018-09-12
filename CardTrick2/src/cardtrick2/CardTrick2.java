package cardtrick2;

import java.util.Scanner;

public class CardTrick2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        for(int i = 0; i < numCases; i++)
        {
            int numCards = input.nextInt();
            int[] set = new int[numCards];
            
            if(numCards == 1)
            {
                System.out.println("1");
            }else
            {           
                int currentIndex = 1;
                int offset = 3;
                int currentCard = 2;
                set[1] = 1;

                while(currentCard <= numCards)
                {
                    for(int j = 0; j < offset; j++)
                    {
                        currentIndex = (currentIndex + 1) % numCards;

                        if(set[currentIndex] != 0)
                            j--;
                    }

                    set[currentIndex] = currentCard;
                    currentCard++;
                    offset++;
                }

                for(int j = 0; j< numCards; j++)
                {
                    System.out.print(set[j] + " ");
                }

                System.out.println("");
            }
        }
    }
}
