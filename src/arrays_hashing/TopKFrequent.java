package arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        TopKFrequent solution = new TopKFrequent();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        System.out.print("Top " + k + " frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
