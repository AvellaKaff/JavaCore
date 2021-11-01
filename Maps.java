package lesson4;

import java.util.*;

public class Maps {
    public static void main(String args[]) {


        ArrayList<String> words = new ArrayList<>(Arrays.asList("компьютер", "мышка", "клавиатура", "монитор", "колонки","компьютер", "колонки", "монитор", "монитор", "мышка", "мышка", "мышка"));


        Map<String, Integer> countMap = new HashMap<>();

        for (String item : words) {

            if (countMap.containsKey(item))
                countMap.put(item, countMap.get(item) + 1);
            else
                countMap.put(item, 1);
        }
        System.out.println(countMap);
    }
}
