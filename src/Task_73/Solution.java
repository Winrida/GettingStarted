package Task_73;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        int[] array = new int[alphabet.size()];
        for (String check : list) {
            for (char ch : check.toCharArray()) {
                int index = alphabet.indexOf(ch);
                if (index < 0) {
                    continue;
                }
                array[index]++;
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            char ch = alphabet.get(i);
            System.out.println(ch + " " + array[i]);
        }
    }
}
