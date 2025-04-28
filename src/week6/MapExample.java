package week6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    void treeMap() {
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Adrian", 10);
        scores.put("John", 20);
        System.out.println(scores.get("Adrian"));
    }

    void hashMap() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Adrian", 10);
        scores.put("John", 20);
        System.out.println(scores.get("Adrian"));
    }
}
