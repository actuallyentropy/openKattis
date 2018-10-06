package Krizaljka;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);
	    String first = input.next();
	    String second = input.next();

	    int x = -1;
	    int y = -1;

	    for(int i = 0; i < first.length(); i++)
		{
			for(int j = 0; j < second.length(); j++)
			{
				if(first.charAt(i) == second.charAt(j))
				{
					y = i;
					x = j;
					break;
				}
			}

			if(x != -1)
				break;
		}

		for(int i = 0; i < second.length(); i++)
		{
			for(int j = 0; j < first.length(); j++)
			{
				if(y == j)
					System.out.print(second.charAt(i));
				else if (x == i)
					System.out.print(first.charAt(j));
				else
					System.out.print(".");
			}
			System.out.println();
		}
    }
}
