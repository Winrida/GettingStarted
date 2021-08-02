package Task_19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Year = reader.readLine();
        int nYear = Integer.parseInt(Year);

        if (nYear % 400 == 0 && nYear % 100 == 0)
        {
            System.out.println("количество дней в году: 366");
        }
        else if (nYear % 4 == 0 && nYear % 100 != 0)
        {
            System.out.println("количество дней в году: 366");
        }
        else System.out.println("количество дней в году: 365");

    }
}
