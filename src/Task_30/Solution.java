package Task_30;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while(true)
        {
            String Money = reader.readLine();
            if(Objects.equals(Money, "сумма"))
            {
                System.out.println(sum);
                break;
            }
            else
            {
                int iMoney = Integer.parseInt(Money);
                sum += iMoney;
            }
        }
    }
}
