package leetcode.medium.strings;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

    static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            char current = maxHeap.remove();
            result.append(String.valueOf(current).repeat(Math.max(0, map.get(current))));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("cccaaa"));
    }
}
