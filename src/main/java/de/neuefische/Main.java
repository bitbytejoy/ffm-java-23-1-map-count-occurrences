package de.neuefische;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(countOccurrences(List.of("Alice", "Bob", "Hendrik", "Dennis", "Bob", "Alice", "Bob")));
    }

    public static Map<String, Integer> countOccurrences(List<String> words) {
        Map<String, Integer> occurrences = new HashMap<>();

        for (String word : words) {
            if (!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                occurrences.put(word, occurrences.get(word) + 1);
            }
        }

        return occurrences;
    }
}