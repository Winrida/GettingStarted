package Task_7;

public class Solution
{
    public static int min(int a, int b, int c)
    {
        if (a > b) a = b;
        if (a < c) return a;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
