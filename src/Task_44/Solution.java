package Task_44;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        String[] str = new String[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            num[i] = str[i].length();
            System.out.println(num[i]);
        }

    }
}
