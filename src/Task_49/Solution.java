package Task_49;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_del3 = new ArrayList<Integer>();
        ArrayList<Integer> list_del2 = new ArrayList<Integer>();
        ArrayList<Integer> list_another = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            Integer number = Integer.parseInt(reader.readLine());
            list.add(number);
            if (number % 3 == 0) {
                list_del3.add(number);
            }
            if (number % 2 == 0) {
                list_del2.add(number);
            }
            if (number % 3 != 0 && number % 2 != 0) {
                list_another.add(number);
            }
        }
        printList(list_del3);
        printList(list_del2);
        printList(list_another);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
