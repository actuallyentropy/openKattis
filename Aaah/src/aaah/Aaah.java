package aaah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aaah 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String jonAaah = input.readLine();
        String doctorAaah = input.readLine();
        
        if(jonAaah.length() >= doctorAaah.length())
            System.out.println("go");
        else
            System.out.println("no");
    }
}
