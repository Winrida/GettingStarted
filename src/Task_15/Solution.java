package Task_15;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number)
    {
        int splitter = 0;
        for(int i = 0; i < 3; i++)
        {
            splitter += number % 10;
            number /= 10;
        }
        return splitter;
    }
}
