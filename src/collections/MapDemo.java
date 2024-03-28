package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        Map<String, Integer> marksSynchronized = new Hashtable<>(); // Hashtable is synchronized
        marks.put("navin", 56);
        marks.put("jay", 68);
        marks.put("pravin", 78);
        marks.put("sakshi", 72);

        System.out.println(marks);

        for (String key : marks.keySet()) {
            System.out.println(key + ": " + marks.get(key));
        }
    }
}
