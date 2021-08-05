package Task_27;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        float x = 0, sum = 0;
        while (true)
        {
            float number = Float.parseFloat(reader.readLine());
            if(number == -1)
            {
                System.out.println(sum/x);
                break;
            }
            x++;
            sum += number;
        }
    }
}
