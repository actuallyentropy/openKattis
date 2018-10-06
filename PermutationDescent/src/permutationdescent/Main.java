package permutationdescent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{///bad
    static long recCount(long order, long descents)
    {
        if(order == 0 || order == descents - 1)
            return 1;

        return (recCount(order - 1, descents) * (descents + 1)) + (recCount(order - 1, descents - 1) * (order - descents));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int numCases = Integer.parseInt(input.readLine());

        for(int i = 0; i < numCases; i++)
        {
            String[] data = input.readLine().split(" ");
            System.out.println(data[0] + " " + (recCount(Long.parseLong(data[1]), Long.parseLong(data[2])) % 1001113));
        }
    }
}
