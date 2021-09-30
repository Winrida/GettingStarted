package Task_52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException {
        int[] array = getInts();


        int maximum = array[0];
        int minimum = array[0];

        for (int i = 1; i < 20; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    static public int[] getInts() throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
