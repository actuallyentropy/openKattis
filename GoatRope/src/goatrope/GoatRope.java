package goatrope;

import java.util.Scanner;

public class GoatRope 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int goatX = input.nextInt();
       int goatY = input.nextInt();
       int left = input.nextInt();
       int down = input.nextInt();
       int right = input.nextInt();
       int up = input.nextInt();
       
       if(goatX >= left && goatX <= right)
       {
           if(goatY <= down)
           {
               System.out.println(down - goatY);
           } else
           {
               System.out.println(goatY - up);
           }
       } else if(goatY >= down && goatY <= up)
       {
           if(goatX <= left)
               System.out.println(left - goatX);
           else
               System.out.println(goatX - right);
       } else if(goatX <= left && goatY <= down)
       {
           double res = Math.sqrt(Math.pow((left - goatX), 2) + Math.pow(down - goatY, 2));
           System.out.println(res);
       } else if(goatX <= left && goatY >= up)
       {
           double res = Math.sqrt(Math.pow((left - goatX), 2) + Math.pow(goatY - up, 2));
           System.out.println(res);
       } else if(goatX >= right && goatY <= down)
       {
           double res = Math.sqrt(Math.pow((goatX - right), 2) + Math.pow(down - goatY, 2));
           System.out.println(res);
       }else
       {
           double res = Math.sqrt(Math.pow((goatX - right), 2) + Math.pow(goatY - up, 2));
           System.out.println(res);
       }
    }
}
