package Task_5;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.print(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int TC)
    {
        return (9 / 5.0) * TC + 32; // Возврат TF
    }
}
