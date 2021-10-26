package Task_67;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat ff = new SimpleDateFormat("D");
        int x = Integer.parseInt(ff.format(date1));
        return x%2 != 0;
    }
}
