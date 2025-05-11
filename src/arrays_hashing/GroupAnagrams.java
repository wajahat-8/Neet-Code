package arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    // Main method for testing
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);

        System.out.println(result);
    }
}
