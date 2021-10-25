package Task_61;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сильвестр Сталлоне", dateFormat.parse("JUL 6 1946"));
        map.put("Фиби Тонкин", dateFormat.parse("JUL 12 1989"));
        map.put("Эдди Редмэйн", dateFormat.parse("JAN 6 1982"));
        map.put("Кен Лоуч", dateFormat.parse("JUN 17 1936"));
        map.put("Усэйн Болт", dateFormat.parse("AUG 21 1986"));
        map.put("Том Мейган", dateFormat.parse("JAN 11 1981"));
        map.put("Энди Гарсиа", dateFormat.parse("APR 12 1956"));
        map.put("Лэнс Хенриксен", dateFormat.parse("MAY 5 1940"));
        map.put("Эсекьель Гарай", dateFormat.parse("OCT 10 1986"));
        map.put("Кэтрин Лэнгфорд", dateFormat.parse("APR 29 1996"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.values().removeIf(check -> check.getMonth()>=5&&check.getMonth()<=7);
    }

    public static void main(String[] args) throws ParseException {

    }
}