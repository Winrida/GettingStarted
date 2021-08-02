package Task_20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minutes = Double.parseDouble(reader.readLine()) % 5;


        if (minutes < 3)
        {
            System.out.println("зелёный");
        }
        else if (minutes < 4)
        {
            System.out.println("жёлтый");
        }
        else System.out.println("красный");
    }
}
