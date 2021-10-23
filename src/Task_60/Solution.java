package Task_60;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Шарапов", "Володя");
        map.put("Жиглов", "Глеб");
        map.put("Барабанов", "Костя");
        map.put("Шишкин", "Володя");
        map.put("Трубко", "Анастасия");
        map.put("Шараповц", "Илья");
        map.put("Амигова", "Ольга");
        map.put("Лапенко", "Сергей");
        map.put("Смирнов", "Костя");
        map.put("Адреналинова", "Екатерина");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int fname = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if(pair.getValue().equals(name))
                fname++;
        }
        return fname;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int sname = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if(pair.getKey().equals(lastName))
                sname++;
        }
        return sname;
    }

    public static void main(String[] args) {

    }
}
