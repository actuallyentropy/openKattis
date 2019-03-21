package simpleaddition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SimpleAddition 
{
    public static void main(String[] args) throws IOException 
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       BigInteger first = new BigInteger(input.readLine());
       BigInteger second = first.add(new BigInteger(input.readLine()));
       System.out.println(second);
    }
}
