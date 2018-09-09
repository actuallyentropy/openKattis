package bookingaroom;

import java.util.Scanner;

public class BookingARoom 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean[] rooms = new boolean[input.nextInt()];
        int booked = input.nextInt();
        
        for(int i = 0; i < booked; i++)
        {
            rooms[input.nextInt() - 1] = true;
        }
        
        for(int i = 0; i < rooms.length; i++)
        {
            if(!rooms[i])
            {
                System.out.println((i + 1));
                return;
            }
        }
        
        System.out.println("too late");
    }
}
