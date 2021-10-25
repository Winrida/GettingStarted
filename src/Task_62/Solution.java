package Task_62;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Челикс1", "Багет");
        map.put("Челикс2", "Батон");
        map.put("Челикс3", "Вагон");
        map.put("Челикс4", "ДжимиНейтрон");
        map.put("Челикс5", "Каркассон");
        map.put("Челикс6", "Вазлетитпрямовад");
        map.put("Челикс7", "Импостер");
        map.put("Челикс8", "Багет");
        map.put("Челикс9", "Хочутортик");
        map.put("Челикс10", "Ауе");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map <String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;

            for (String two : map.values()) {
                if (two.equals(name)) {
                    count++;
                }
            }

            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
