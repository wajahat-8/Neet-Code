package arrays_hashing;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (freq[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            freq[t.charAt(i) - 'a']--;
        }
        return true;
    }

    // Test the solution
    public static void main(String[] args) {
        IsAnagram checker = new IsAnagram();

        // Test case 1: Valid anagram
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test 1: " + checker.isAnagram(s1, t1)); // Expected: true

        // Test case 2: Not an anagram
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Test 2: " + checker.isAnagram(s2, t2)); // Expected: false

        // Test case 3: Different lengths
        String s3 = "hello";
        String t3 = "hi";
        System.out.println("Test 3: " + checker.isAnagram(s3, t3)); // Expected: false

        // Test case 4: Empty strings
        String s4 = "";
        String t4 = "";
        System.out.println("Test 4: " + checker.isAnagram(s4, t4)); // Expected: true
    }
}