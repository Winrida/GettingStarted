package Task_13;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (input.hasNextInt())
        {
            int number = input.nextInt();
            System.out.println("Вы ввели число: " + number);
        } else
            {
            System.out.println("Вы ввели не число, попробуйте снова.");
            }
        input.close();
    }
}
