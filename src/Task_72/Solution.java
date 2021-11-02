package Task_72;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());

        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(formatter.format(date).toUpperCase(Locale.ROOT));

    }

}