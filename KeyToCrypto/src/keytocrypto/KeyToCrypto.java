package keytocrypto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToCrypto 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String secret = input.readLine();
        String key = input.readLine();
        String plain = "";
        
        for(int i = 0; i < secret.length(); i++)
        {
            int shift = (int)key.charAt(i) - 65;
            int toShift = (int)secret.charAt(i) - 65;
            toShift = (toShift - shift);
            if(toShift < 0)
                toShift += 26;
            
            key += (char)(toShift + 65);
            plain += (char)(toShift + 65);
        }        
        
        System.out.println(plain);
    }
}
