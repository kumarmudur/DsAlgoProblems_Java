package leetcode.easy.arrays;

import java.util.*;

public class FrequencySortArray {

    static int[] frequencySortArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println("map" + map);

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> (Objects.equals(map.get(a), map.get(b))) ? b - a : map.get(a) - map.get(b));

        int[] result = new int[nums.length];
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) {
                result[i++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1,1,-6,4,5,-6,1,4,1 };
        System.out.println(Arrays.toString(frequencySortArray(nums)));
    }
}
