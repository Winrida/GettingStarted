package Task_63;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> createMap() {
        Map <String, Integer> map = new HashMap<>();

        map.put("АрбузЧёткий", 7800);
        map.put("ШапкаНеушанка", 900);
        map.put("ЛампаСветец", 1600);
        map.put("ШишкаКрутышка", 14000);
        map.put("КапляСухая", 350);
        map.put("МолнияБелая", 4000);
        map.put("БелкаЛетяга", 9300);
        map.put("ШредерУбивец", 60400);
        map.put("ГитараДжент", 23500);
        map.put("ХтоЯ", 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);

        //for (Integer name : copy.values()) {
        for (Map.Entry<String, Integer> name : copy.entrySet()) {
            int money = 500;

            if (name.getValue() < money) {
                map.remove(name.getKey());
            }

        }
    }

    public static void main(String[] args) {

    }
}