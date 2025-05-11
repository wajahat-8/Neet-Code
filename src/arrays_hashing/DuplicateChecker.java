package arrays_hashing;

import java.util.Arrays;

public class DuplicateChecker {

    // Method to check for duplicates
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array first
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        DuplicateChecker checker = new DuplicateChecker();
        int[] nums = {3, 1, 4, 2, 5, 3}; // Example array

        boolean result = checker.containsDuplicate(nums);
        System.out.println("Contains duplicate? " + result); // Should print true
    }
}
