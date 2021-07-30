package Task_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine(); // Читаем строку с клавиатуры
        String sAge = reader.readLine();  // Читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); // Преобразовываем строку в число.

        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
