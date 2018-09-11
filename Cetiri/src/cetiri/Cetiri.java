package cetiri;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cetiri 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[3];
        
        for(int i = 0; i < 3; i++)
            numbers[i] = input.nextInt();      
        
        Arrays.sort(numbers);
        int difference1 = numbers[1] - numbers[0];
        int difference2 = numbers[2] - numbers[1];
        
        if((difference1 * 2) + numbers[1] == numbers[2])
        {
            System.out.println(numbers[1] + difference1);
        }else if(difference1 + numbers[1] == numbers[2])
        {
            System.out.println(numbers[2] + difference1);
        }else if((difference2 * 2) + numbers[0] == numbers[1])
        {
            System.out.println(numbers[0] + difference2);
        }
    }
}
