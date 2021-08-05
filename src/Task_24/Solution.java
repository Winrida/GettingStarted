package Task_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        while (true)
        {
            int number = Integer.parseInt(reader.readLine());
            x += number;
            if(number == -1) break;
        }
        System.out.println(x);
    }
}
